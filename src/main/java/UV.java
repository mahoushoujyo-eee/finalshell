/*
 * Decompiled with CFR 0.152.
 */
interface UV {
    public static final String[] F;
    public static final String[] d;
    public static final char[] t;

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block19: {
                var0 = new String[29];
                var4_1 = 0;
                var3_2 = "Naj{\bNiyuyBZ@\u0005Ninbn'Z@\u000bbYrd{AXU\u001cu{4jYBSs4W@YBYb`}@E\u0010ndeaJXD\u0005Nlysk\nNlcqpMQZhn\u0006Nni\u007fnU\u0006N}b~uU\u0004Njdv\u0007@ffusT@\u0005Nlys{\u0006Nld}lM\u0005Nkjd}\u0006N|b~uU\u0005Q}y\u007fn\u0007N}zyrH@\u0005Nlysy\u0011Z@\u000bs]sf}JY\u0010xd`qL_\u0004Nnh{\u0004Nib~\u0005Nlysm\u0004Nlys\u0005lWSHD\bNld}q@ZP\u0004Nlj~\u0007N|\u007ftySF\u0005N}{\u007fo";
                var5_3 = "Naj{\bNiyuyBZ@\u0005Ninbn'Z@\u000bbYrd{AXU\u001cu{4jYBSs4W@YBYb`}@E\u0010ndeaJXD\u0005Nlysk\nNlcqpMQZhn\u0006Nni\u007fnU\u0006N}b~uU\u0004Njdv\u0007@ffusT@\u0005Nlys{\u0006Nld}lM\u0005Nkjd}\u0006N|b~uU\u0005Q}y\u007fn\u0007N}zyrH@\u0005Nlysy\u0011Z@\u000bs]sf}JY\u0010xd`qL_\u0004Nnh{\u0004Nib~\u0005Nlysm\u0004Nlys\u0005lWSHD\bNld}q@ZP\u0004Nlj~\u0007N|\u007ftySF\u0005N}{\u007fo".length();
                var2_4 = 4;
                var1_5 = -1;
lbl7:
                // 2 sources

                while (true) {
                    v0 = 73;
                    v1 = ++var1_5;
                    v2 = var3_2.substring(v1, v1 + var2_4);
                    v3 = -1;
                    break block19;
                    break;
                }
lbl13:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    var3_2 = "#\u0004\u000f\u0011\u0014\u0005#\u0011\r\u0014\u0001";
                    var5_3 = "#\u0004\u000f\u0011\u0014\u0005#\u0011\r\u0014\u0001".length();
                    var2_4 = 5;
                    var1_5 = -1;
lbl22:
                    // 2 sources

                    while (true) {
                        v0 = 36;
                        v5 = ++var1_5;
                        v2 = var3_2.substring(v5, v5 + var2_4);
                        v3 = 0;
                        break block19;
                        break;
                    }
                    break;
                }
lbl28:
                // 1 sources

                while (true) {
                    var0[var4_1++] = v4.intern();
                    if ((var1_5 += var2_4) < var5_3) {
                        var2_4 = var3_2.charAt(var1_5);
                        ** continue;
                    }
                    break block20;
                    break;
                }
            }
            v6 = v2.toCharArray();
            v7 = v6.length;
            var6_6 = 0;
            v8 = v0;
            v9 = v6;
            v10 = v7;
            if (v7 > 1) ** GOTO lbl85
            do {
                v11 = v8;
                v9 = v9;
                v12 = v9;
                v13 = v8;
                v14 = var6_6;
                while (true) {
                    switch (var6_6 % 7) {
                        case 0: {
                            v15 = 93;
                            break;
                        }
                        case 1: {
                            v15 = 102;
                            break;
                        }
                        case 2: {
                            v15 = 98;
                            break;
                        }
                        case 3: {
                            v15 = 121;
                            break;
                        }
                        case 4: {
                            v15 = 117;
                            break;
                        }
                        case 5: {
                            v15 = 72;
                            break;
                        }
                        default: {
                            v15 = 93;
                        }
                    }
                    v12[v14] = (char)(v12[v14] ^ (v13 ^ v15));
                    ++var6_6;
                    v8 = v11;
                    if (v11 != 0) break;
                    v11 = v8;
                    v9 = v9;
                    v14 = v8;
                    v12 = v9;
                    v13 = v8;
                }
lbl85:
                // 2 sources

                v16 = v9;
                v10 = v10;
            } while (v10 > var6_6);
            v4 = new String(v16);
            switch (v3) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl95:
                // 1 sources

                ** continue;
            }
        }
        UV.F = new String[]{var0[3], var0[17], var0[9], var0[14], var0[15], var0[7], var0[13], var0[18], var0[27], var0[28], var0[0], var0[6], var0[19], var0[26], var0[12], var0[8], var0[2], var0[21], var0[5], var0[11], var0[24], var0[1], var0[23], var0[25], var0[22]};
        UV.d = new String[]{var0[16], var0[10], var0[20], var0[4]};
        UV.t = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }
}

