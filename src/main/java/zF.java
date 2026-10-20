/*
 * Decompiled with CFR 0.152.
 */
import com.ky_2;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class zF
extends MessageToByteEncoder {
    protected void J(ChannelHandlerContext channelHandlerContext, xU xU2, ByteBuf byteBuf) throws Exception {
        int[] nArray = xU.t();
        byteBuf.writeInt(xU2.S());
        int[] nArray2 = nArray;
        try {
            byteBuf.writeInt(xU2.j());
            byteBuf.writeBytes(xU2.C());
            if (nArray2 == null) {
                ky_2.K(new String[3]);
            }
        }
        catch (Exception exception) {
            throw zF.a(exception);
        }
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, Object object, ByteBuf byteBuf) throws Exception {
        this.J(channelHandlerContext, (xU)object, byteBuf);
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

