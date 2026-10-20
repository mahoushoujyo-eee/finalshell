/*
 * Decompiled with CFR 0.152.
 */
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.ReadTimeoutHandler;

class aO
extends ChannelInitializer {
    private static final String a;

    aO() {
    }

    protected void H(SocketChannel socketChannel) throws Exception {
        socketChannel.pipeline().addLast(a, (ChannelHandler)new ReadTimeoutHandler(5));
        socketChannel.pipeline().addLast(new zF());
        socketChannel.pipeline().addLast(new lz_0());
        socketChannel.pipeline().addLast(new BA());
    }

    protected void initChannel(Channel channel) throws Exception {
        this.H((SocketChannel)channel);
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
                char[] cArray3 = "#93v~?\u001643'fb7\u0015507`".toCharArray();
                int n13 = cArray3.length;
                n12 = 0;
                n11 = 20;
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
                    cArray4[n16] = (char)(cArray4[n16] ^ (n15 ^ (switch (n12 % 7) {
                        case 0 -> 69;
                        case 1 -> 72;
                        case 2 -> 70;
                        case 3 -> 6;
                        case 4 -> 62;
                        case 5 -> 66;
                        default -> 111;
                    })));
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

