import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import org.jdesktop.swingx.JXList;

class UF extends ComponentAdapter {
   final FK l;
   private static final long a;

   UF(FK var1) {
      this.l = var1;
   }

   @Override
   public void componentResized(ComponentEvent var1) {
      int var2 = ((JXList)com.c.c(369475678680292668L).get(com.c.c(513954246938583342L).get(this))).getCellBounds(0, 0).height;
      int var3 = ((JXList)com.c.c(369475678680292668L).get(com.c.c(513954246938583342L).get(this))).getHeight() / var2;
      var3 = (int)a;
      ((JXList)com.c.c(369475678680292668L).get(com.c.c(513954246938583342L).get(this))).setVisibleRowCount(var3);
   }

   static {
      long var0 = 4742410471088708704L;
      long var10002 = -2686463112112645004L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





