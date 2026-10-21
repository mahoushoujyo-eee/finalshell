import java.awt.Color;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JTable;

public class DT extends JTable {
   fr_4 a;
   DT I;
   Jx_2 l;
   private static final long[] b;
   private static final Integer[] c;

   DT(Jx_2 var1, fr_4 var2) {
      com.c.c(520595572764773303L).set(this, this);
      com.c.c(129770487350982726L).set(this, var1);
      com.c.c(537287653217599524L).set(this, var2);
      this.setModel(var2);
      this.setOpaque(false);
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.getTableHeader().setVisible(false);
      this.setTableHeader(null);
      Ql_2 var3 = new Ql_2();
      this.setDefaultRenderer(Object.class, var3);
      this.setRowHeight(a(28146, 69380773180708842L));
      this.setShowGrid(true);
      int var4 = a(24585, 6455712407774927376L);
      this.setGridColor(new Color(var4, var4, var4));
      this.addMouseListener(new m9(this, var1, var2));
   }

   public YI m(int var1) {
      Object var10000 = com.c.c(537287653217599524L).get(this);
      Object[] var10001 = com.c.a(this.convertRowIndexToModel(var1));
      Method var10003 = com.c.d(501106210434703361L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var10000;
      var10000 = var10003;

      try {
         return (YI)var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }
   }

   static {
      long var0 = 4616535941730501940L;
      long[] var6 = new long[2];
      int var3 = 0;
      String var4 = "\u008b_\u0019¦Ð\u0006\u0012ºádÕ@æ*\u001fì";
      int var5 = "\u008b_\u0019¦Ð\u0006\u0012ºádÕ@æ*\u001fì".length();
      byte var2 = 0;

      do {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         var10001 = var3++;
         long var10004 = (
               ((long)var7[0] & 255L) << 56
                  | ((long)var7[1] & 255L) << 48
                  | ((long)var7[2] & 255L) << 40
                  | ((long)var7[3] & 255L) << 32
                  | ((long)var7[4] & 255L) << 24
                  | ((long)var7[5] & 255L) << 16
                  | ((long)var7[6] & 255L) << 8
                  | (long)var7[7] & 255L
            )
            ^ var0;
         byte var10003 = -1;
         var6[var10001] = var10004;
      } while (var2 < var5);

      b = var6;
      c = new Integer[2];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 31256;
      if (c[var3] == null) {
         c[var3] = (int)(b[var3] ^ var1);
      }

      return c[var3];
   }
}





