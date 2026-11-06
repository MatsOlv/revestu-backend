package com.br.revestu.usuario;
import com.br.revestu.Infra.UsuarioJaExisteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

        @Autowired
        private UsuarioRepository usuarioRepository;

        public UsuarioResponse salvar(UsuarioRequest usuario) {
            if (usuarioRepository.existsById(usuario.cpf()))
                throw new UsuarioJaExisteException("Usuario já existe!");
            var usuario1 = usuarioRepository.save(new Usuario(usuario.cpf(),
                                        usuario.nomeUsuario(),
                                        null,
                                        null));
            return new UsuarioResponse(usuario1.getNomeUsuario());
        }

        public List<Usuario> listarTodos() {
            return usuarioRepository.findAll();
        }

        public Optional<Usuario> buscarPorCpf(String cpf) {
            return usuarioRepository.findById(cpf);
        }

        public Usuario atualizar(String cpf, Usuario Usuario) {
            return usuarioRepository.findById(cpf)
                    .map(usuario -> {
                        Usuario.setNomeUsuario(usuario.getNomeUsuario());
                        return usuarioRepository.save(Usuario);
                    })
                    .orElseThrow(() -> new RuntimeException("Usuário com o CPF: " + cpf + " não encontrado "));
        }

        public void deletar(String cpf) {
            if (!usuarioRepository.existsById(cpf)) {
                throw new RuntimeException("Usuário com o CPF: " + cpf + " não encontrado ");
            }
            usuarioRepository.deleteById(cpf);
        }
    }