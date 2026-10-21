import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.tree.DefaultMutableTreeNode;

class nu_2 implements MouseMotionListener {
   final aJ J;
   private static final long a;

   nu_2(aJ var1) {
      this.J = var1;
   }

   @Override
   public void mouseMoved(MouseEvent var1) {
      String var2 = aA.z();
      aJ var10000 = (aJ)com.c.c(468723888490930522L).get(this);
      if (var2 == null) {
         if ((as_2)com.c.c(624888273314831754L).get(var10000) != null) {
            byte var3;
            label116: {
               var3 = 0;
               l5_2 var20 = (l5_2)com.c.c(486701759580007258L).get(com.c.c(468723888490930522L).get(this));
               if (var2 == null) {
                  if (var20 == null) {
                     break label116;
                  }

                  var20 = (l5_2)com.c.c(486701759580007258L).get(com.c.c(468723888490930522L).get(this));
               }

               var3 = var20.isVisible();
            }

            int var21 = var3;
            if (var2 == null) {
               if (var3 != 0) {
                  var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
                  Object[] var62 = com.c.f();
                  Method var79 = com.c.d(196767746087547704L);
                  Object[] var71 = var62;
                  var62 = var10000;
                  Method var45 = var79;

                  try {
                     var46 = (Tv_2)var45.invoke(var62, var71);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  var46.setVisible(false);
                  return;
               }

               var10000 = (aJ)com.c.c(468723888490930522L).get(this);
               Object[] var10001 = com.c.a(var1.getPoint());
               Method var10003 = com.c.d(379754982100791858L);
               Object[] var10002 = var10001;
               var10001 = var10000;
               Method var23 = var10003;

               try {
                  var21 = (Integer)var23.invoke(var10001, var10002);
               } catch (InvocationTargetException var19) {
                  throw var19.getTargetException();
               }
            }

            int var4;
            label125: {
               var4 = var21;
               int var24 = var4;
               if (var2 == null) {
                  if (var4 <= 0) {
                     var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
                     Object[] var60 = com.c.f();
                     Method var78 = com.c.d(196767746087547704L);
                     Object[] var70 = var60;
                     var60 = var10000;
                     Method var42 = var78;

                     try {
                        var43 = (Tv_2)var42.invoke(var60, var70);
                     } catch (InvocationTargetException var12) {
                        throw var12.getTargetException();
                     }

                     var43.setVisible(false);
                     return;
                  }

                  var10000 = (aJ)com.c.c(593306439561595691L).get(com.c.c(468723888490930522L).get(this));
                  if (var2 != null) {
                     break label125;
                  }

                  var24 = var10000.getWidth() - var1.getX();
               }

               if (var24 < 5) {
                  var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
                  Object[] var48 = com.c.f();
                  Method var72 = com.c.d(196767746087547704L);
                  Object[] var64 = var48;
                  var48 = var10000;
                  Method var27 = var72;

                  try {
                     var28 = (Tv_2)var27.invoke(var48, var64);
                  } catch (InvocationTargetException var13) {
                     throw var13.getTargetException();
                  }

                  var28.setVisible(false);
                  return;
               }

               var10000 = (aJ)com.c.c(593306439561595691L).get(com.c.c(468723888490930522L).get(this));
            }

            Object[] var50 = com.c.a(var4);
            Method var73 = com.c.d(313360281912871059L);
            Object[] var65 = var50;
            aJ var51 = var10000;
            Method var29 = var73;

            try {
               var30 = (DefaultMutableTreeNode)var29.invoke(var51, var65);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            DefaultMutableTreeNode var5 = var30;
            Rectangle var6 = ((aJ)com.c.c(593306439561595691L).get(com.c.c(468723888490930522L).get(this))).getRowBounds(var4);
            var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
            var50 = com.c.f();
            var73 = com.c.d(196767746087547704L);
            var65 = var50;
            var50 = var10000;
            Method var32 = var73;

            try {
               var33 = (Tv_2)var32.invoke(var50, var65);
            } catch (InvocationTargetException var17) {
               throw var17.getTargetException();
            }

            Tv_2 var7 = var33;
            int var8 = var7.getPreferredSize().width;
            int var9 = ((aJ)com.c.c(468723888490930522L).get(this)).getWidth() - var8 + (int)a;
            Rectangle var10 = new Rectangle(var9, var6.y + (var6.height - var7.getPreferredSize().height) / 2, var8, var7.getPreferredSize().height);
            var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
            var50 = com.c.f();
            var73 = com.c.d(365890984302619917L);
            var65 = var50;
            var50 = var10000;
            Method var35 = var73;

            try {
               var10000 = (aJ)var35.invoke(var50, var65);
            } catch (InvocationTargetException var16) {
               throw var16.getTargetException();
            }

            var50 = com.c.a(var10, var5);
            var73 = com.c.d(487349169158243555L);
            var65 = var50;
            var50 = var10000;
            Method var37 = var73;

            try {
               var37.invoke(var50, var65);
            } catch (InvocationTargetException var15) {
               throw var15.getTargetException();
            }

            var10000 = (aJ)com.c.c(624888273314831754L).get(com.c.c(468723888490930522L).get(this));
            var50 = com.c.f();
            var73 = com.c.d(196767746087547704L);
            var65 = var50;
            var50 = var10000;
            Method var39 = var73;

            try {
               var40 = (Tv_2)var39.invoke(var50, var65);
            } catch (InvocationTargetException var14) {
               throw var14.getTargetException();
            }

            var40.setVisible(true);
         }

         var10000 = (aJ)com.c.c(468723888490930522L).get(this);
      }

      com.c.c(137395258222385003L).setBoolean(var10000, false);
   }

   @Override
   public void mouseDragged(MouseEvent var1) {
      com.c.c(137395258222385003L).setBoolean(com.c.c(468723888490930522L).get(this), false);
   }

   static {
      long var0 = 6369184685716270362L;
      long var10002 = 7287735958193696018L ^ var0;
      byte var10001 = -1;
      a = var10002;
   }
}





