/*
 * File:   Cipher.java
 *
 * Created on 02/03/16, 16:07
 */
package br.com.sisnunes.security;

import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 * @author higor
 */
public class Cipher
{

  private BigInteger crypt(BigInteger msg, Key key)
  {
    return msg.modPow(key.getE(), key.getN());
  }

  public byte[] encrypt(String str, Key key)
  {
    byte[] bytes = str.getBytes(Charset.defaultCharset());
    byte[] cipher = crypt(new BigInteger(bytes), key).toByteArray();

    return cipher;
  }

  public String decrypt(byte[] cipher, Key key)
  {
    byte[] msg = crypt(new BigInteger(cipher), key).toByteArray();
    return new String(msg);
  }
}
