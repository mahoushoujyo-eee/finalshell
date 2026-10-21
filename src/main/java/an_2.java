import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

class an_2 extends as_2 {
   final GradientPaint m;
   final uV_3 s;

   an_2(uV_3 var1, nj_2 var2, aJ var3, GradientPaint var4) {
      super(var2, var3);
      this.s = var1;
      this.m = var4;
   }

   @Override
   protected void paintComponent(Graphics var1) {
      super.paintComponent(var1);
      Graphics2D var2 = (Graphics2D)var1;
      var2.setPaint((GradientPaint)com.c.c(625238686649497327L).get(this));
      var2.fillRect(0, 0, this.getWidth(), this.getHeight());
   }
}





