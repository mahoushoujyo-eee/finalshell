import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class FT extends AbstractTableModel {
   private ArrayList G;
   String[] F;
   Class[] H;
   private static final String a;

   public FT() {
      com.c.c(234790626336419274L).set(this, new ArrayList());
      com.c.c(568529913670890891L).set(this, new String[]{a});
      com.c.c(300909370335316961L).set(this, new Class[]{Object.class});
   }

   @Override
   public int getRowCount() {
      return ((ArrayList)com.c.c(234790626336419274L).get(this)).size();
   }

   @Override
   public int getColumnCount() {
      return 1;
   }

   @Override
   public String getColumnName(int var1) {
      return ((String[])com.c.c(568529913670890891L).get(this))[var1];
   }

   public void g() {
      ((ArrayList)com.c.c(234790626336419274L).get(this)).clear();
   }

   @Override
   public Class getColumnClass(int var1) {
      return ((Class[])com.c.c(300909370335316961L).get(this))[var1];
   }

   public void I(int var1) {
      ((ArrayList)com.c.c(234790626336419274L).get(this)).remove(var1);
      this.fireTableRowsDeleted(var1, var1);
   }

   public synchronized void R(L1 var1) {
      ((ArrayList)com.c.c(234790626336419274L).get(this)).add(var1);
      this.fireTableRowsInserted(((ArrayList)com.c.c(234790626336419274L).get(this)).size() - 1, ((ArrayList)com.c.c(234790626336419274L).get(this)).size() - 1);
   }

   public synchronized void S(L1 var1) {
      ((ArrayList)com.c.c(234790626336419274L).get(this)).add(0, var1);
      this.fireTableRowsInserted(0, 0);
   }

   @Override
   public Object getValueAt(int var1, int var2) {
      return (L1)((ArrayList)com.c.c(234790626336419274L).get(this)).get(var1);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "\u0016%r".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 98;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      } else {
         var6 = 98;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 98;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 23;
               break;
            case 1:
               var23 = 42;
               break;
            case 2:
               var23 = 116;
               break;
            case 3:
               var23 = 108;
               break;
            case 4:
               var23 = 94;
               break;
            case 5:
               var23 = 24;
               break;
            default:
               var23 = 6;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





