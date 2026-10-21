import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JButton;

class mk_2 implements Fb_2 {
   final VN i;

   mk_2(VN var1) {
      this.i = var1;
   }

   @Override
   public void O(ty_4 var1) {
      int var10000 = z2.w();
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
      int var2 = var10000;
      var10000 = var3;
      int var7 = com.c.c(372606448848052772L).getInt(null);
      if (var2 != 0) {
         if (var3 == var7) {
            ((JButton)com.c.c(402079050501623703L).get(com.c.c(330303588933417996L).get(this))).setEnabled(false);
            if (var2 != 0) {
               return;
            }
         }

         var10000 = var3;
         var7 = com.c.c(213416441008748074L).getInt(null);
      }

      if (var10000 == var7) {
         ((JButton)com.c.c(402079050501623703L).get(com.c.c(330303588933417996L).get(this))).setEnabled(true);
      }
   }
}





