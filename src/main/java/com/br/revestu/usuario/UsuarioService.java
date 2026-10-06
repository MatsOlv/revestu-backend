package com.br.revestu.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

        @Autowired
        private UsuarioRepository usuarioRepository;

        public Usuario salvar(Usuario usuario) {
            return usuarioRepository.save(usuario);
        }

        public List<Usuario> listarTodos() {
            return usuarioRepository.findAll();
        }

        public Optional<Usuario> buscarPorCpf(String cpf) {
            return usuarioRepository.findById(cpf);
        }

        public Usuario atualizar(String cpf, Usuario usuarioAtualizado) {
            return usuarioRepository.findById(cpf)
                    .map(usuarioExistente -> {
                        usuarioExistente.setNomeUsuario(usuarioAtualizado.getNomeUsuario());
                        return usuarioRepository.save(usuarioExistente);
                    })
                    .orElseThrow(() -> new RuntimeException("Usuário não encontrado com o CPF: " + cpf));
        }

        public void deletar(String cpf) {
            if (!usuarioRepository.existsById(cpf)) {
                throw new RuntimeException("Usuário não encontrado com o CPF: " + cpf);
            }
            usuarioRepository.deleteById(cpf);
        }
    }