/*
 * File:   PubKey.java
 *
 * Created on 02/03/16, 15:48
 */
package br.com.sisnunes.security;

import java.math.BigInteger;

/**
 * @author higor
 */
public class Key
{
  private BigInteger _n;
  private BigInteger _e;

  public Key(BigInteger n, BigInteger e)
  {
    _n = n;
    _e = e;
  }

  public BigInteger getN()
  {
    return _n;
  }

  public BigInteger getE()
  {
    return _e;
  }
}
