package br.com.sisnunes.security;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String msg = "Hello World!";
    	RSA rsa = new RSA(128);

			Cipher cipher = new Cipher();
    	byte[] crypt = cipher.encrypt(msg, rsa.getPublicKey());
    	
    	System.out.println("orig: " + msg);
    	System.out.println("enc: " + new String(crypt));
    	System.out.println("dec: " + cipher.decrypt(crypt, rsa.getPrivateKey()));
    			
    }
}
