import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class df_4 implements ActionListener {
   final K_ d;

   df_4(K_ var1) {
      this.d = var1;
   }

   @Override
   public void actionPerformed(ActionEvent var1) {
      int[] var2 = Jx_2.O();
      boolean var10000 = ((com.Qe_2)com.c.c(442601371933228411L).get(com.c.c(220996271143196752L).get(this))).isSelected();
      if (var2 == null) {
         if (var10000) {
            com.c.c(144708592452319805L).setInt(com.c.c(220996271143196752L).get(this), com.c.c(168555354480801721L).getInt(null));
            ((com.Qe_2)com.c.c(442601371933228411L).get(com.c.c(220996271143196752L).get(this))).setSelected(true);
            if (var2 == null) {
               return;
            }
         }

         var10000 = ((com.Qe_2)com.c.c(266390688568107078L).get(com.c.c(220996271143196752L).get(this))).isSelected();
      }

      label46: {
         if (var2 == null) {
            if (var10000) {
               ((com.Qe_2)com.c.c(266390688568107078L).get(com.c.c(220996271143196752L).get(this))).setSelected(true);
               Object var4 = com.c.c(220996271143196752L).get(this);
               Object[] var10001 = com.c.a(com.c.c(503182329446332632L).get(com.c.c(220996271143196752L).get(this)));
               Method var10003 = com.c.d(602040225738704982L);
               Object[] var10002 = var10001;
               var10001 = (Object[])var4;
               Method var5 = var10003;

               try {
                  var5.invoke(var10001, var10002);
               } catch (InvocationTargetException var3) {
                  throw var3.getTargetException();
               }

               if (var2 == null) {
                  return;
               }
            }

            var6 = (com.KD)com.c.c(624825723918235119L).get(com.c.c(220996271143196752L).get(this));
            if (var2 != null) {
               break label46;
            }

            var10000 = var6.isSelected();
         }

         if (!var10000) {
            return;
         }

         var6 = (com.KD)com.c.c(624825723918235119L).get(com.c.c(220996271143196752L).get(this));
      }

      var6.setSelected(true);
      com.c.c(144708592452319805L).setInt(com.c.c(220996271143196752L).get(this), com.c.c(553670676087696590L).getInt(null));
   }
}





