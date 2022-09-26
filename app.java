public class app {
    public static void main(String[] args) {  
        Usuario usuario = new Usuario();
        usuario.setNome("USUARIO");
        usuario.setDataNasc("00/00/0000");
        usuario.setCpf("000.000.000-00");
        usuario.setTelefone("+55 21 00000-0000");
        usuario.setEmail("usuario@gmail.com");
        usuario.setSenha("usuario123");

System.out.println("*Tela de cadastro*");
System.out.println(usuario.getNome() + "\n" + usuario.getDataNasc() + "\n" + usuario.getCpf() + "\n" + usuario.getTelefone() + "\n" + usuario.getEmail() + "\n" + usuario.getSenha());
    }
   
}
