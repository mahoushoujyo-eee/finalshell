import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;

public class LQ extends JTable {
   zK m;
   oa_4 O;
   private static final long[] a;
   private static final Integer[] b;

   LQ(zK var1, oa_4 var2) {
      com.c.c(461718445990442402L).set(this, var1);
      com.c.c(556189680979940906L).set(this, var2);
      this.setModel(var2);
      this.setSelectionBackground((Color)com.c.c(623875439513009390L).get(null));
      this.setSelectionMode(0);
      xM var4 = new xM();
      this.setDefaultRenderer(zG.class, var4);
      String[] var10000 = zK.B();
      this.setShowGrid(false);
      int var5 = a(4664, 6672082193902842022L);
      this.setGridColor(new Color(var5, var5, var5));
      this.addMouseListener(new JF(this, var2, var1));
      String[] var3 = var10000;
      TableColumnModel var6 = this.getColumnModel();
      TableColumnModel var7 = var6;
      if (var3 != null) {
         if (var6.getColumnCount() <= 1) {
            return;
         }

         var6.getColumn(0).setPreferredWidth(a(19387, 7183216449445751078L));
         var7 = var6;
      }

      var7.getColumn(1).setPreferredWidth(a(21734, 5361513782989223545L));
   }

   static {
      long var0 = 2137019640573185596L;
      long[] var6 = new long[3];
      int var3 = 0;
      String var4 = "üëKîg\u000b9iW\u0003\u0088jÝ¬~RDYìÛ\u0007\u0091'~";
      int var5 = "üëKîg\u000b9iW\u0003\u0088jÝ¬~RDYìÛ\u0007\u0091'~".length();
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

      a = var6;
      b = new Integer[3];
   }

   private static int a(int var0, long var1) {
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 8863;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





