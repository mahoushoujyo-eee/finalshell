import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class l4_2 implements Fb_2 {
   final ak_2 m;

   l4_2(ak_2 var1) {
      this.m = var1;
   }

   @Override
   public void O(ty_4 var1) {
      String var10000 = ak_2.u();
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(542590257020999358L);
      Object[] var10003 = var10002;
      ty_4 var8 = var1;
      Method var10001 = var10004;

      try {
         var6 = (Integer)var10001.invoke(var8, var10003);
      } catch (InvocationTargetException var4) {
         throw var4.getTargetException();
      }

      int var3 = var6;
      String var2 = var10000;
      int var5 = var3;
      int var7 = com.c.c(372606448848052772L).getInt(null);
      if (var2 != null) {
         if (var3 == var7) {
            ((JButton)com.c.c(304856760029970283L).get(com.c.c(300416987385116995L).get(this))).setEnabled(false);
            if (var2 != null) {
               return;
            }
         }

         var5 = var3;
         var7 = com.c.c(213416441008748074L).getInt(null);
      }

      if (var5 == var7) {
         ((JButton)com.c.c(304856760029970283L).get(com.c.c(300416987385116995L).get(this))).setEnabled(true);
      }
   }
}





