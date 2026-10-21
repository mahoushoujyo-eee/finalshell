import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class da_4 {
   private static final long[] a;
   private static final Integer[] b;

   private JScrollPane j() {
      JTree var1 = new JTree();
      var1.setDragEnabled(true);
      var1.setDropMode(DropMode.ON_OR_INSERT);
      var1.setTransferHandler(new T8());
      var1.getSelectionModel().setSelectionMode(2);
      Object[] var10001 = com.c.a(var1);
      Method var10003 = com.c.d(456314098107551553L);
      Object[] var10002 = var10001;
      da_4 var3 = this;
      Method var10000 = var10003;

      try {
         var10000.invoke(var3, var10002);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      return new JScrollPane(var1);
   }

   private void H(JTree var1) {
      String[] var10000 = F8.y();
      DefaultMutableTreeNode var3 = (DefaultMutableTreeNode)var1.getModel().getRoot();
      String[] var2 = var10000;
      Enumeration var4 = var3.breadthFirstEnumeration();

      while (var4.hasMoreElements()) {
         DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var4.nextElement();
         int var7 = var5.isLeaf();
         if (var2 == null) {
            if (var7 != 0) {
               continue;
            }

            var7 = var1.getRowForPath(new TreePath(var5.getPath()));
         }

         int var6 = var7;
         var1.expandRow(var6);
         if (var2 != null) {
            break;
         }
      }
   }

   public static void main(String[] var0) {
      JFrame var1 = new JFrame();
      var1.setDefaultCloseOperation(3);
      da_4 var10001 = new da_4();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(437711895013604562L);
      Object[] var10003 = var10002;
      da_4 var5 = var10001;
      Method var3 = var10004;

      try {
         var4 = (JScrollPane)var3.invoke(var5, var10003);
      } catch (InvocationTargetException var2) {
         throw var2.getTargetException();
      }

      var1.add(var4);
      var1.setSize(a(9918, 4914330257659809117L), a(11822, 3670117610238035406L));
      var1.setLocation(a(18280, 9010126470277147785L), a(7687, 1898245755519038949L));
      var1.setVisible(true);
   }

   static {
      long var0 = 2957805752508551391L;
      long[] var6 = new long[4];
      int var3 = 0;
      String var4 = "E¹\u0095Y,%\\\u0012×\u0089s£:ûåò";
      int var5 = "E¹\u0095Y,%\\\u0012×\u0089s£:ûåò".length();
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

                  var4 = "ªù\u0013oR×¼\u009eä Ü[RÅÔ\u0081";
                  var5 = "ªù\u0013oR×¼\u009eä Ü[RÅÔ\u0081".length();
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
      int var3 = var0 ^ (int)(var1 & 32767L) ^ 27619;
      if (b[var3] == null) {
         b[var3] = (int)(a[var3] ^ var1);
      }

      return b[var3];
   }
}





