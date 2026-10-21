import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class nA extends JTable {
   Y_ Z;
   VX g;
   private static final long[] a;
   private static final Integer[] b;

   nA(Y_ var1, VX var2) {
      com.c.c(405008577441249220L).set(this, var1);
      com.c.c(535440215674240412L).set(this, var2);
      this.setModel(var2);
      String[] var10002 = Y_.j();
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionMode(0);
      C6 var4 = new C6();
      this.setDefaultRenderer(lN_3.class, var4);
      this.setShowGrid(false);
      String[] var3 = var10002;
      int var5 = a(4474, 7314591075151813528L);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new y4_2(this));
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var10000 = var6;
      if (var3 != null) {
         if (var6.getColumnCount() <= 2) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(2175, 1413830116305502876L));
         var6.getColumn(1).setPreferredWidth(a(16363, 6373331554484532490L));
         var10000 = var6;
      }

      var10000.getColumn(2).setPreferredWidth(a(13044, 1039826064687446036L));
   }

   static {
      long var0 = 7188211259457863402L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "dö\u0003uN¤K\u0084\u0085îð\r¯\u0091Æ\u009a";
      int var5 = "dö\u0003uN¤K\u0084\u0085îð\r¯\u0091Æ\u009a".length();
      byte var2 = 0;

      label20:
      while (true) {
         int var10001 = var2;
         var2 += 8;
         byte[] var7 = var4.substring(var10001, var2).getBytes("ISO-8859-1");
         long[] var10000 = var6;
         var10001 = var3++;
         long var10002 = ((long)var7[0] & 255L) << 56
            | ((long)var7[1] & 255L) << 48
            | ((long)var7[2] & 255L) << 40
            | ((long)var7[3] & 255L) << 32
            | ((long)var7[4] & 255L) << 24
            | ((long)var7[5] & 255L) << 16
            | ((long)var7[6] & 255L) << 8
            | (long)var7[7] & 255L;
         byte var10003 = -1;

         while (true) {
            long var13 = var10002 ^ var0;
            switch (var10003) {
               case 0:
                  var10000[var10001] = var13;
                  if (var2 >= var5) {
                     a = var6;
                     b = new Integer[4];
                     return;
                  }
                  break;
               default:
                  var10000[var10001] = var13;
                  if (var2 < var5) {
                     continue label20;
                  }

                  var4 = "Ñ\u000e\u0001ú½Q|¾,\u001fÛ¬UØeº";
                  var5 = "Ñ\u000e\u0001ú½Q|¾,\u001fÛ¬UØeº".length();
                  var2 = 0;
            }

            byte var10 = var2;
            var2 += 8;
            var7 = var4.substring(var10, var2).getBytes("ISO-8859-1");
            var10000 = var6;
            var10001 = var3++;
            var10002 = ((long)var7[0] & 255L) << 56
               | ((long)var7[1] & 255L) << 48
               | ((long)var7[2] & 255L) << 40
               | ((long)var7[3] & 255L) << 32
               | ((long)var7[4] & 255L) << 24
               | ((long)var7[5] & 255L) << 16
               | ((long)var7[6] & 255L) << 8
               | (long)var7[7] & 255L;
            var10003 = 0;
         }
      }
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 2785;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





