/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;

public class WQ {
    private static String V;
    private static final long[] a;
    private static final Integer[] b;
    private static final long[] c;
    private static final Long[] d;

    public static int y(byte[] byArray, int n10) {
        int n11;
        int n12;
        String string;
        int n13;
        int n14;
        block9: {
            int n15 = WQ.a(13197, 6767060242505760426L);
            int n16 = WQ.a(24129, 2762923885076845395L);
            int n17 = WQ.a(31123, 3481093960209380530L);
            int n18 = WQ.a(3466, 4342495464462172294L);
            int n19 = 5;
            int n20 = WQ.a(29038, 1187943839769640005L);
            n14 = n10;
            n13 = byArray.length;
            string = WQ.H();
            n12 = n13 & WQ.a(21611, 1127487676949469558L);
            for (n11 = 0; n11 < n12; n11 += 4) {
                int n21 = byArray[n11] & WQ.a(26521, 5011925406786759299L) | (byArray[n11 + 1] & WQ.a(4510, 3331824955331959956L)) << WQ.a(4947, 1642543640318041674L) | (byArray[n11 + 2] & WQ.a(4510, 3331824955331959956L)) << WQ.a(12139, 5820180700194038381L) | (byArray[n11 + 3] & WQ.a(4510, 3331824955331959956L)) << WQ.a(915, 1864416489461141139L);
                n21 *= WQ.a(381, 1517377184340954219L);
                n21 = Integer.rotateLeft(n21, WQ.a(31123, 3481093960209380530L));
                n14 ^= (n21 *= WQ.a(29224, 3054362521927925548L));
                n14 = Integer.rotateLeft(n14, WQ.a(3466, 4342495464462172294L));
                n14 = n14 * 5 + WQ.a(5035, 8656462902644235939L);
                if (string == null) {
                    if (string == null) continue;
                }
                break block9;
            }
            n11 = 0;
        }
        int n22 = n13 & 3;
        if (string == null) {
            switch (n22) {
                case 3: {
                    n11 ^= (byArray[n12 + 2] & WQ.a(4510, 3331824955331959956L)) << WQ.a(12139, 5820180700194038381L);
                }
                case 2: {
                    n11 ^= (byArray[n12 + 1] & WQ.a(4510, 3331824955331959956L)) << WQ.a(4947, 1642543640318041674L);
                }
                case 1: {
                    n11 ^= byArray[n12] & WQ.a(4510, 3331824955331959956L);
                    n11 *= WQ.a(381, 1517377184340954219L);
                    n11 = Integer.rotateLeft(n11, WQ.a(31123, 3481093960209380530L));
                    n14 ^= (n11 *= WQ.a(29224, 3054362521927925548L));
                }
            }
            n14 ^= n13;
            n14 ^= n14 >>> WQ.a(12139, 5820180700194038381L);
            n14 *= WQ.a(22582, 2467533060512814382L);
            n14 ^= n14 >>> WQ.a(3466, 4342495464462172294L);
            n14 *= WQ.a(26819, 1086815534219961831L);
            n14 ^= n14 >>> WQ.a(12139, 5820180700194038381L);
            n22 = n14;
        }
        if (ky_2.F() != null) {
            WQ.C("liI6b");
        }
        return n22;
    }

    public static long[] A(byte[] byArray, int n10) {
        long l2;
        String string;
        int n11;
        int n12;
        long l3;
        long l4;
        block20: {
            long l5 = WQ.b(30204, 778639446394293286L);
            long l6 = WQ.b(27462, 1365980114020455071L);
            int n13 = WQ.a(23231, 1253327073870223294L);
            int n14 = WQ.a(13531, 6661263535525362140L);
            int n15 = WQ.a(31633, 5534612396029392543L);
            int n16 = 5;
            long l7 = WQ.b(29277, 5372630048538676109L);
            long l8 = WQ.b(24766, 2104238932973312365L);
            l4 = (long)n10 & WQ.b(30741, 4282831706854441409L);
            l3 = (long)n10 & WQ.b(3910, 8586923411419870864L);
            n12 = byArray.length;
            n11 = n12 & WQ.a(15617, 6765240455423750177L);
            string = WQ.H();
            for (int i2 = 0; i2 < n11; i2 += 16) {
                long l9 = WQ.Q(byArray, i2);
                long l10 = WQ.Q(byArray, i2 + WQ.a(31967, 3668033655317705153L));
                l9 *= WQ.b(12140, 1820641327000229566L);
                l9 = Long.rotateLeft(l9, WQ.a(29785, 2665782920770828622L));
                l4 ^= (l9 *= WQ.b(9199, 704174023778376242L));
                l4 = Long.rotateLeft(l4, WQ.a(14579, 2738800092853728748L));
                l4 += l3;
                l4 = l4 * WQ.b(30076, 5354743543328427177L) + WQ.b(27679, 8489639316515575240L);
                l10 *= WQ.b(9199, 704174023778376242L);
                l10 = Long.rotateLeft(l10, WQ.a(14667, 524145075995440216L));
                l3 ^= (l10 *= WQ.b(12140, 1820641327000229566L));
                l3 = Long.rotateLeft(l3, WQ.a(29785, 2665782920770828622L));
                l2 = (l3 += l4) * WQ.b(24737, 6643969445453486457L) + WQ.b(32755, 3283889297720559149L);
                if (string == null) {
                    l3 = l2;
                    if (string == null) continue;
                    ky_2.K(new String[1]);
                    break;
                }
                break block20;
            }
            l2 = 0L;
        }
        long l11 = l2;
        long l12 = 0L;
        int n17 = n12 & WQ.a(6459, 2519596713538507832L);
        if (string == null) {
            switch (n17) {
                case 15: {
                    l12 ^= ((long)byArray[n11 + WQ.a(5447, 2100350744839444552L)] & WQ.b(21913, 942178451249785922L)) << WQ.a(24209, 5471762348240540563L);
                }
                case 14: {
                    l12 ^= ((long)byArray[n11 + WQ.a(10700, 4216838691169592537L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(30920, 3403671092365473259L);
                }
                case 13: {
                    l12 ^= ((long)byArray[n11 + WQ.a(452, 5253871214346030288L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(13548, 7457197707286149582L);
                }
                case 12: {
                    l12 ^= ((long)byArray[n11 + WQ.a(15971, 233234887654339398L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(12388, 6293439969133231436L);
                }
                case 11: {
                    l12 ^= ((long)byArray[n11 + WQ.a(12848, 8902084491804737310L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(8882, 9086557603095801755L);
                }
                case 10: {
                    l12 ^= ((long)byArray[n11 + WQ.a(30947, 5706752502023927295L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(4947, 1642543640318041674L);
                }
                case 9: {
                    l12 ^= (long)byArray[n11 + WQ.a(4947, 1642543640318041674L)] & WQ.b(6541, 7355715004967231580L);
                    l12 *= WQ.b(9199, 704174023778376242L);
                    l12 = Long.rotateLeft(l12, WQ.a(14667, 524145075995440216L));
                    l3 ^= (l12 *= WQ.b(12140, 1820641327000229566L));
                }
                case 8: {
                    l11 ^= ((long)byArray[n11 + WQ.a(16602, 509384625955016188L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(20056, 7109998466134377297L);
                }
                case 7: {
                    l11 ^= ((long)byArray[n11 + WQ.a(933, 7803510114521665167L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(4978, 7384540874462256745L);
                }
                case 6: {
                    l11 ^= ((long)byArray[n11 + 5] & WQ.b(6541, 7355715004967231580L)) << WQ.a(28266, 119993862969467770L);
                }
                case 5: {
                    l11 ^= ((long)byArray[n11 + 4] & WQ.b(6541, 7355715004967231580L)) << WQ.a(5011, 1082419445758418562L);
                }
                case 4: {
                    l11 ^= ((long)byArray[n11 + 3] & WQ.b(6541, 7355715004967231580L)) << WQ.a(915, 1864416489461141139L);
                }
                case 3: {
                    l11 ^= ((long)byArray[n11 + 2] & WQ.b(6541, 7355715004967231580L)) << WQ.a(12139, 5820180700194038381L);
                }
                case 2: {
                    l11 ^= ((long)byArray[n11 + 1] & WQ.b(6541, 7355715004967231580L)) << WQ.a(4947, 1642543640318041674L);
                }
                case 1: {
                    l11 ^= (long)byArray[n11] & WQ.b(6541, 7355715004967231580L);
                    l11 *= WQ.b(12140, 1820641327000229566L);
                    l11 = Long.rotateLeft(l11, WQ.a(29785, 2665782920770828622L));
                    l4 ^= (l11 *= WQ.b(9199, 704174023778376242L));
                }
            }
            l4 ^= (long)n12;
            l4 += (l3 ^= (long)n12);
            l3 += l4;
            l4 = WQ.l(l4);
            l3 = WQ.l(l3);
            l4 += l3;
            l3 += l4;
            n17 = 2;
        }
        long[] lArray = new long[n17];
        lArray[0] = l4;
        lArray[1] = l3;
        return lArray;
    }

    private static long Q(byte[] byArray, int n10) {
        return (long)byArray[n10] & WQ.b(6541, 7355715004967231580L) | ((long)byArray[n10 + 1] & WQ.b(6541, 7355715004967231580L)) << WQ.a(4947, 1642543640318041674L) | ((long)byArray[n10 + 2] & WQ.b(6541, 7355715004967231580L)) << WQ.a(12139, 5820180700194038381L) | ((long)byArray[n10 + 3] & WQ.b(6541, 7355715004967231580L)) << WQ.a(915, 1864416489461141139L) | ((long)byArray[n10 + 4] & WQ.b(6541, 7355715004967231580L)) << WQ.a(5011, 1082419445758418562L) | ((long)byArray[n10 + 5] & WQ.b(6541, 7355715004967231580L)) << WQ.a(28266, 119993862969467770L) | ((long)byArray[n10 + WQ.a(32160, 2783051855589060781L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(4978, 7384540874462256745L) | ((long)byArray[n10 + WQ.a(16285, 8993675542397121176L)] & WQ.b(6541, 7355715004967231580L)) << WQ.a(12936, 7180301626574208899L);
    }

    private static long l(long l2) {
        l2 ^= l2 >>> WQ.a(14667, 524145075995440216L);
        l2 *= WQ.b(14786, 3425798755487154206L);
        l2 ^= l2 >>> WQ.a(14667, 524145075995440216L);
        l2 *= WQ.b(18928, 5441612500571648047L);
        l2 ^= l2 >>> WQ.a(14667, 524145075995440216L);
        return l2;
    }

    public static void C(String string) {
        V = string;
    }

    public static String H() {
        return V;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        var8 = 3191732413460529079L;
                        var14_1 = new long[45];
                        var11_2 = 0;
                        var12_3 = "\u00a8\u00b4kZDV,\u0014\u00d0\u00f5\u0083\u000e\u00bd\u00dek\u0080\u00a4\u009d\u00aa\u00e3u\u00dcq<^S|\u00a7c\u0000(\u0016F\u00bd}\u0089\u00a9\u00cc]\u00ca\u00e4y\u0090T\u00b4*Fp\u00d5E\u0002\u00ad\u00c7*\u00b5\b|\u00d4\u00f9\tk\u00d8\u00cd(8^Y\u00e4\u00d6=\u00e3\u00dc\u0017P\u00d4pjw@\fs,u\u00df\u00b7J\u008ap\u00b4\u00cc\u0099\u008a\r\u00e9<\u00deqd\u0010h\u00b8\u00a4\t\t\u00d6\\d\u00fc\u00e3\u008b\u00e7\u00f1I\u00e7\u00ef\u008b<i\u007f<%h\u008fw\u00e9\u008a\u008f\u001c\u00cc\u00f4\u00070\u00ae\u009f\u0099w\u00a95\u00d7\u001d[\u0010K\u00ceA6\u00e4\u00f5k\u00ef\u009c\u00e5\r7\u00a2kp\r\u00e1\u0015\u0000\u00fc\u00fei\u0080\u0018\u00de\u008d}\f\u00d1\u00b6z\u00b3\u0006\u00e6\u0085\u00e9\u00f7\u00db\u00b0\u00d4\u00f3k\u0018\u00ba-\u00ca\u0094#[c\u0015\u001d\u00f97Z-\u0095\u00cb\f&E\u00a1\u00d1\u00c6\u00e1\u00eeh\u0085\u00e0\u00ac\u0000\u00e7\u00e0\u00f2*Jz\u00c33Q\u00e1\u00f5\u0002\u00d8\u0081M\u00db\t\u008e~F\u0090\u00b7\u00faG0J@P\u0001\u001a\u0018\n_\nA8Y\u00d3CD\u00a1\u00d9=\u001d\u0002\u00d8\u008a8\u00cf\u00c6Y\u00b8\u0090mU\n\u00df\u008at\u00c5@\u00ed\u00f5x7\u00b0f^a\u009a\u00b7Rc\u008b\nl\u00b7\u0081\u00befr2LG\u00f1#\u0018\u0016\u00cdlLq\u00b9\u00f0\u00cd\u00adV4e\u00ab~&\u00c81\u00b7L\u00fa\u00ed\u00019\u00e4\u008bQq>\u00e9\u00fa\u00db\n\u0002\u00abh\u0096z\u00d9'\u00e9\u00fd\u0004B\u00e3";
                        var13_4 = "\u00a8\u00b4kZDV,\u0014\u00d0\u00f5\u0083\u000e\u00bd\u00dek\u0080\u00a4\u009d\u00aa\u00e3u\u00dcq<^S|\u00a7c\u0000(\u0016F\u00bd}\u0089\u00a9\u00cc]\u00ca\u00e4y\u0090T\u00b4*Fp\u00d5E\u0002\u00ad\u00c7*\u00b5\b|\u00d4\u00f9\tk\u00d8\u00cd(8^Y\u00e4\u00d6=\u00e3\u00dc\u0017P\u00d4pjw@\fs,u\u00df\u00b7J\u008ap\u00b4\u00cc\u0099\u008a\r\u00e9<\u00deqd\u0010h\u00b8\u00a4\t\t\u00d6\\d\u00fc\u00e3\u008b\u00e7\u00f1I\u00e7\u00ef\u008b<i\u007f<%h\u008fw\u00e9\u008a\u008f\u001c\u00cc\u00f4\u00070\u00ae\u009f\u0099w\u00a95\u00d7\u001d[\u0010K\u00ceA6\u00e4\u00f5k\u00ef\u009c\u00e5\r7\u00a2kp\r\u00e1\u0015\u0000\u00fc\u00fei\u0080\u0018\u00de\u008d}\f\u00d1\u00b6z\u00b3\u0006\u00e6\u0085\u00e9\u00f7\u00db\u00b0\u00d4\u00f3k\u0018\u00ba-\u00ca\u0094#[c\u0015\u001d\u00f97Z-\u0095\u00cb\f&E\u00a1\u00d1\u00c6\u00e1\u00eeh\u0085\u00e0\u00ac\u0000\u00e7\u00e0\u00f2*Jz\u00c33Q\u00e1\u00f5\u0002\u00d8\u0081M\u00db\t\u008e~F\u0090\u00b7\u00faG0J@P\u0001\u001a\u0018\n_\nA8Y\u00d3CD\u00a1\u00d9=\u001d\u0002\u00d8\u008a8\u00cf\u00c6Y\u00b8\u0090mU\n\u00df\u008at\u00c5@\u00ed\u00f5x7\u00b0f^a\u009a\u00b7Rc\u008b\nl\u00b7\u0081\u00befr2LG\u00f1#\u0018\u0016\u00cdlLq\u00b9\u00f0\u00cd\u00adV4e\u00ab~&\u00c81\u00b7L\u00fa\u00ed\u00019\u00e4\u008bQq>\u00e9\u00fa\u00db\n\u0002\u00abh\u0096z\u00d9'\u00e9\u00fd\u0004B\u00e3".length();
                        WQ.C(null);
                        var10_5 = 0;
                        while (true) {
                            var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                            v0 = var14_1;
                            v1 = var11_2++;
                            v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                            v3 = -1;
                            break block14;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            var12_3 = "\u0080\u00e1K\ta\u00ccP<\u00aat\u00ea\u00cb$\u00e2\u00c0\u00a3";
                            var13_4 = "\u0080\u00e1K\ta\u00ccP<\u00aat\u00ea\u00cb$\u00e2\u00c0\u00a3".length();
                            var10_5 = 0;
                            while (true) {
                                var15_6 = var12_3.substring(var10_5, var10_5 += 8).getBytes("ISO-8859-1");
                                v0 = var14_1;
                                v1 = var11_2++;
                                v2 = ((long)var15_6[0] & 255L) << 56 | ((long)var15_6[1] & 255L) << 48 | ((long)var15_6[2] & 255L) << 40 | ((long)var15_6[3] & 255L) << 32 | ((long)var15_6[4] & 255L) << 24 | ((long)var15_6[5] & 255L) << 16 | ((long)var15_6[6] & 255L) << 8 | (long)var15_6[7] & 255L;
                                v3 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            v0[v1] = v4;
                            if (var10_5 < var13_4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    v4 = v2 ^ var8;
                    switch (v3) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl39:
                        // 1 sources

                        ** continue;
                    }
                }
                WQ.a = var14_1;
                WQ.b = new Integer[45];
                var0_7 = 6133426277232085216L;
                var6_8 = new long[16];
                var3_9 = 0;
                var4_10 = "\u00d8\u0013}Q\u0085E\u0017\u0013X\r\u0004\u00fc\u00d3\u00b2d]\t*Q\u00b1\u0088\u00ba\u00d1\u009c\u000b\u001f\f]\u00e3]I\u0000x\u008c\u00f9Y6i\u0014x\u00daT\u008a\u00f0\u00f1\u0017\u0014\u009c\u0085\u00c5\u0000\u00b5G\u00eb\u00043\u0010.Y{\u00fal\u0081\u00ad\u00cb\u0099\u0002\u0086\u00f8\u000b\u00cd\u008bH-\u008c\u009a\u00fcU\u008b8\u001f\u0091$#\u00ec\u0017$D3\n\u00f1`\u00cab(C\"4\u00af\u00eb\u00f2\u00a2A\u008f \u00cf\u000fI\u00c8\u00b2:\u0001";
                var5_11 = "\u00d8\u0013}Q\u0085E\u0017\u0013X\r\u0004\u00fc\u00d3\u00b2d]\t*Q\u00b1\u0088\u00ba\u00d1\u009c\u000b\u001f\f]\u00e3]I\u0000x\u008c\u00f9Y6i\u0014x\u00daT\u008a\u00f0\u00f1\u0017\u0014\u009c\u0085\u00c5\u0000\u00b5G\u00eb\u00043\u0010.Y{\u00fal\u0081\u00ad\u00cb\u0099\u0002\u0086\u00f8\u000b\u00cd\u008bH-\u008c\u009a\u00fcU\u008b8\u001f\u0091$#\u00ec\u0017$D3\n\u00f1`\u00cab(C\"4\u00af\u00eb\u00f2\u00a2A\u008f \u00cf\u000fI\u00c8\u00b2:\u0001".length();
                var2_12 = 0;
                while (true) {
                    var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                    v5 = var6_8;
                    v6 = var3_9++;
                    v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                    v8 = -1;
                    break block16;
                    break;
                }
lbl56:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    var4_10 = "nq\u00e2\r\u00e6^6\u00de\u001fQ\u0090R%\u001fDL";
                    var5_11 = "nq\u00e2\r\u00e6^6\u00de\u001fQ\u0090R%\u001fDL".length();
                    var2_12 = 0;
                    while (true) {
                        var7_13 = var4_10.substring(var2_12, var2_12 += 8).getBytes("ISO-8859-1");
                        v5 = var6_8;
                        v6 = var3_9++;
                        v7 = ((long)var7_13[0] & 255L) << 56 | ((long)var7_13[1] & 255L) << 48 | ((long)var7_13[2] & 255L) << 40 | ((long)var7_13[3] & 255L) << 32 | ((long)var7_13[4] & 255L) << 24 | ((long)var7_13[5] & 255L) << 16 | ((long)var7_13[6] & 255L) << 8 | (long)var7_13[7] & 255L;
                        v8 = 0;
                        break block16;
                        break;
                    }
                    break;
                }
lbl69:
                // 1 sources

                while (true) {
                    v5[v6] = v9;
                    if (var2_12 < var5_11) ** continue;
                    break block17;
                    break;
                }
            }
            v9 = v7 ^ var0_7;
            switch (v8) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl80:
                // 1 sources

                ** continue;
            }
        }
        WQ.c = var6_8;
        WQ.d = new Long[16];
    }

    private static int a(int n10, long l2) {
        int n11 = n10 ^ (int)(l2 & 0x7FFFL) ^ 0x4D02;
        if (b[n11] == null) {
            WQ.b[n11] = (int)(a[n11] ^ l2);
        }
        return b[n11];
    }

    private static long b(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x39DA) & Short.MAX_VALUE;
        if (d[n11] == null) {
            WQ.d[n11] = c[n11] ^ l2;
        }
        return d[n11];
    }
}

