/*
 * Decompiled with CFR 0.152.
 */
class xW
implements Runnable {
    final CB H;
    private static final String a;
    private static final long[] b;
    private static final Long[] c;

    xW(CB cB) {
        this.H = cB;
    }

    /*
     * Exception decompiling
     */
    @Override
    public void run() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 27[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static InterruptedException a(InterruptedException interruptedException) {
        return interruptedException;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        char[] cArray;
        block13: {
            int n10;
            char[] cArray2;
            int n11;
            int n12;
            block12: {
                char[] cArray3 = "2\nU".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 15;
                cArray2 = cArray3;
                n10 = n13;
                if (n13 <= 1) break block12;
                cArray = cArray2;
                n10 = n10;
                if (n10 <= n12) break block13;
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
                            n17 = 73;
                            break;
                        }
                        case 1: {
                            n17 = 106;
                            break;
                        }
                        case 2: {
                            n17 = 42;
                            break;
                        }
                        case 3: {
                            n17 = 17;
                            break;
                        }
                        case 4: {
                            n17 = 77;
                            break;
                        }
                        case 5: {
                            n17 = 60;
                            break;
                        }
                        default: {
                            n17 = 33;
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
        long l2 = 2787279050392014344L;
        long[] lArray = new long[3];
        int n18 = 0;
        String string = "@\u00ce\u008f,\u001dT\u0085\u00b6F!\u000b)\u001c\u008b6\u00f0y-\u00e9\u0081\u008cNG\u00f7";
        int n19 = "@\u00ce\u008f,\u001dT\u0085\u00b6F!\u000b)\u001c\u008b6\u00f0y-\u00e9\u0081\u008cNG\u00f7".length();
        int n20 = 0;
        do {
            byte[] byArray = string.substring(n20, n20 += 8).getBytes("ISO-8859-1");
            int n21 = n18++;
            lArray[n21] = (((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL) ^ l2;
        } while (n20 < n19);
        b = lArray;
        c = new Long[3];
    }

    private static long a(int n10, long l2) {
        int n11 = (n10 ^ (int)l2 ^ 0x3ACE) & Short.MAX_VALUE;
        if (c[n11] == null) {
            xW.c[n11] = b[n11] ^ l2;
        }
        return c[n11];
    }
}

