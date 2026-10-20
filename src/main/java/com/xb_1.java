/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.co_1;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/*
 * Renamed from com.xB
 */
public class xb_1
implements co_1 {
    byte[] Q;
    byte[] N;
    byte[] v;
    byte[] r;
    byte[] C;
    byte[] t;
    byte[] H;
    byte[] Z;
    private static final String a;

    @Override
    public void D(int n10) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(a);
        keyPairGenerator.initialize(n10, new SecureRandom());
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        this.Q = ((RSAPrivateKey)privateKey).getPrivateExponent().toByteArray();
        this.N = ((RSAPublicKey)publicKey).getPublicExponent().toByteArray();
        this.v = ((RSAPrivateKey)privateKey).getModulus().toByteArray();
        this.r = ((RSAPrivateCrtKey)privateKey).getCrtCoefficient().toByteArray();
        this.C = ((RSAPrivateCrtKey)privateKey).getPrimeExponentP().toByteArray();
        this.t = ((RSAPrivateCrtKey)privateKey).getPrimeExponentQ().toByteArray();
        this.H = ((RSAPrivateCrtKey)privateKey).getPrimeP().toByteArray();
        this.Z = ((RSAPrivateCrtKey)privateKey).getPrimeQ().toByteArray();
    }

    @Override
    public byte[] S() {
        return this.Q;
    }

    @Override
    public byte[] l() {
        return this.N;
    }

    @Override
    public byte[] w() {
        return this.v;
    }

    @Override
    public byte[] g() {
        return this.r;
    }

    @Override
    public byte[] h() {
        return this.C;
    }

    @Override
    public byte[] C() {
        return this.t;
    }

    @Override
    public byte[] R() {
        return this.H;
    }

    @Override
    public byte[] M() {
        return this.Z;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block12: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block11: {
                char[] cArray3 = ".L~".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 10;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block11;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block12;
            }
            do {
                int n14 = n11;
                cArray2 = cArray2;
                char[] cArray4 = cArray2;
                int n15 = n11;
                int n16 = n12;
                while (true) {
                    int n17;
                    switch (n12 % 7) {
                        case 0: {
                            n17 = 118;
                            break;
                        }
                        case 1: {
                            n17 = 21;
                            break;
                        }
                        case 2: {
                            n17 = 53;
                            break;
                        }
                        case 3: {
                            n17 = 30;
                            break;
                        }
                        case 4: {
                            n17 = 1;
                            break;
                        }
                        case 5: {
                            n17 = 17;
                            break;
                        }
                        default: {
                            n17 = 109;
                        }
                    }
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ n17));
                    ++n12;
                    n11 = n14;
                    if (n14 != 0) break;
                    n14 = n11;
                    cArray2 = cArray2;
                    n16 = n11;
                    cArray4 = cArray2;
                    n15 = n11;
                }
                cArray = cArray2;
                n10 = n10;
            } while (n10 > n12);
        }
        a = new String(cArray).intern();
    }
}

