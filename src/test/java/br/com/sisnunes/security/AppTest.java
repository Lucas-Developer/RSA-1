package br.com.sisnunes.security;

import java.security.SecureRandom;
import java.util.Base64;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
      String msgOrig = "Hello World!";
      String decrypted = null;
      RSA rsa = new RSA(64);

      System.out.println("p: " + rsa.getP());
      System.out.println("q: " + rsa.getQ());
      System.out.println("n: " + rsa.getN());
      System.out.println("t: " + rsa.getT());
      System.out.println("e: " + rsa.getE());
      System.out.println("d: " + rsa.getD());
      System.out.println("is coprime: e and t: " + rsa.isCoPrime(rsa.getE(), rsa.getT()));

      assertTrue(rsa.isCoPrime(rsa.getE(), rsa.getT()));

      byte[] crypted = rsa.enc(msgOrig);
      decrypted = rsa.dec(crypted);

      System.out.println("orig: " + msgOrig);
      System.out.println("enc: " + Base64.getEncoder().encodeToString(crypted));
      System.out.println("dec: " + decrypted);

      assertEquals(msgOrig, decrypted);
    }
}
