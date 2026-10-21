import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

class xt_2 implements Runnable {
   final U C;

   xt_2(U var1) {
      this.C = var1;
   }

   @Override
   public void run() {
      com.c.c(498692346592337143L).set(com.c.c(179781909861381783L).get(this), new aj_2());
      ((aj_2)com.c.c(498692346592337143L).get(com.c.c(179781909861381783L).get(this))).setOpaque(false);
      com.c.c(187791590270141607L).set(com.c.c(179781909861381783L).get(this), com.c.c(498692346592337143L).get(com.c.c(179781909861381783L).get(this)));
      ((JSplitPane)com.c.c(467883177032167383L).get(com.c.c(179781909861381783L).get(this)))
         .setLeftComponent((JPanel)com.c.c(187791590270141607L).get(com.c.c(179781909861381783L).get(this)));
      Method var10000 = (Method)com.c.c(179781909861381783L).get(this);
      Object[] var10001 = com.c.f();
      Method var10003 = com.c.d(526151509200330945L);
      Object[] var10002 = var10001;
      var10001 = var10000;
      var10000 = var10003;

      try {
         var10000.invoke(var10001, var10002);
      } catch (InvocationTargetException var1) {
         throw var1.getTargetException();
      }

      com.c.c(329679096789927195L).setBoolean(com.c.c(179781909861381783L).get(this), true);
   }
}





