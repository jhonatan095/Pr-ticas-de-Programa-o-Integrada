package crypto;

import java.io.UnsupportedEncodingException;

public class Cryptography {
    public String crypto(String senha) {
    	String cripto="";
			try {
				String key = "minhachavesecret";
				byte[] bsenha = senha.getBytes("UTF-8");
				System.out.println("mensagem: " + senha);
				byte[] bCripto = CryptoUtils.encrypt(key, bsenha);
				cripto = new String(bCripto, "UTF-8");
				System.out.println("senha criptografada: " + cripto);
			} catch (UnsupportedEncodingException | CryptoException e) {
				e.printStackTrace();
			}
			return cripto;
    }
}