/*
 * Decompiled with CFR 0.152.
 */
package com;

import com.NN;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;

/*
 * Renamed from com.Pw
 */
public class pw_0
implements NN {
    byte[] p;
    byte[] f;
    byte[] N;
    byte[] h;
    byte[] T;
    private static final String a;

    @Override
    public void E(int n10) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(a);
        keyPairGenerator.initialize(n10, new SecureRandom());
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();
        this.p = ((DSAPrivateKey)privateKey).getX().toByteArray();
        this.f = ((DSAPublicKey)publicKey).getY().toByteArray();
        DSAParams dSAParams = ((DSAKey)((Object)privateKey)).getParams();
        this.N = dSAParams.getP().toByteArray();
        this.h = dSAParams.getQ().toByteArray();
        this.T = dSAParams.getG().toByteArray();
    }

    @Override
    public byte[] r() {
        return this.p;
    }

    @Override
    public byte[] Z() {
        return this.f;
    }

    @Override
    public byte[] I() {
        return this.N;
    }

    @Override
    public byte[] P() {
        return this.h;
    }

    @Override
    public byte[] z() {
        return this.T;
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
                char[] cArray3 = "1E^".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 30;
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
                            n17 = 107;
                            break;
                        }
                        case 1: {
                            n17 = 8;
                            break;
                        }
                        case 2: {
                            n17 = 1;
                            break;
                        }
                        case 3: {
                            n17 = 117;
                            break;
                        }
                        case 4: {
                            n17 = 87;
                            break;
                        }
                        case 5: {
                            n17 = 5;
                            break;
                        }
                        default: {
                            n17 = 27;
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

