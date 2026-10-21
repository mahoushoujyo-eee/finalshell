import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

class fk_4 implements KeyListener {
   final a3 G;
   private static final long a;

   fk_4(a3 var1) {
      this.G = var1;
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      int[] var2 = a3.I();
      int var10000 = var1.getKeyCode();
      if (var2 != null) {
         if (var10000 != (int)a) {
            return;
         }

         var10000 = ((a3)com.c.c(173244602779313450L).get(this)).getMinSelectionRow();
      }

      int var3 = var10000;
      Object var14 = com.c.c(173244602779313450L).get(this);
      Object[] var10001 = com.c.a(var3);
      Method var10003 = com.c.d(290714206414786866L);
      Object[] var10002 = var10001;
      var10001 = (Object[])var14;
      Method var15 = var10003;

      try {
         var16 = (DefaultMutableTreeNode)var15.invoke(var10001, var10002);
      } catch (InvocationTargetException var13) {
         throw var13.getTargetException();
      }

      DefaultMutableTreeNode var4 = var16;
      tf_4 var5 = (tf_4)var4.getUserObject();
      boolean var6 = false;
      TreePath var7 = ((a3)com.c.c(230619793659643674L).get(com.c.c(173244602779313450L).get(this))).getPathForRow(var3);
      HashSet var17 = (HashSet)com.c.c(428509894309855334L).get(com.c.c(173244602779313450L).get(this));
      var10002 = com.c.f();
      Method var10004 = com.c.d(498856411508641826L);
      Object[] var39 = var10002;
      tf_4 var34 = var5;
      Method var25 = var10004;

      try {
         var10001 = (String)var25.invoke(var34, var39);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      var17.add(var10001);
      DefaultMutableTreeNode var8 = (DefaultMutableTreeNode)var4.getParent();
      Object var18 = com.c.c(173244602779313450L).get(this);
      var10001 = com.c.a(var8, var5, var7, null, true, false);
      var10003 = com.c.d(523405946948830526L);
      var10002 = var10001;
      var10001 = (Object[])var18;
      Method var19 = var10003;

      try {
         var19.invoke(var10001, var10002);
      } catch (InvocationTargetException var11) {
         throw var11.getTargetException();
      }

      HashSet var20 = (HashSet)com.c.c(490343386624486773L).get(com.c.c(173244602779313450L).get(this));
      var10002 = com.c.f();
      var10004 = com.c.d(498856411508641826L);
      Object[] var41 = var10002;
      tf_4 var37 = var5;
      Method var29 = var10004;

      try {
         var10001 = (String)var29.invoke(var37, var41);
      } catch (InvocationTargetException var10) {
         throw var10.getTargetException();
      }

      label74: {
         boolean var21 = var20.contains(var10001);
         if (var2 != null) {
            if (!var21) {
               return;
            }

            var22 = (a3)com.c.c(173244602779313450L).get(this);
            if (var2 == null) {
               break label74;
            }

            var10001 = com.c.a(var4);
            var10003 = com.c.d(201726770406369370L);
            var10002 = var10001;
            a3 var32 = var22;
            Method var23 = var10003;

            try {
               var21 = (Boolean)var23.invoke(var32, var10002);
            } catch (InvocationTargetException var9) {
               throw var9.getTargetException();
            }
         }

         if (var21) {
            ((a3)com.c.c(173244602779313450L).get(this)).collapsePath(new TreePath(var4.getPath()));
            if (var2 != null) {
               return;
            }
         }

         var22 = (a3)com.c.c(173244602779313450L).get(this);
      }

      var22.expandPath(new TreePath(var4.getPath()));
   }

   static {
      long var0 = 7404190692422060865L;
      long var10002 = 7091899772039203659L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





