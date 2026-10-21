import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;

class x8 implements TreeSelectionListener {
   final DefaultMutableTreeNode p;
   final zb_2 l;
   final DefaultMutableTreeNode q;
   final z9 U;
   final DefaultMutableTreeNode f;
   final km_4 O;

   x8(km_4 var1, DefaultMutableTreeNode var2, zb_2 var3, DefaultMutableTreeNode var4, z9 var5, DefaultMutableTreeNode var6) {
      this.O = var1;
      this.p = var2;
      this.l = var3;
      this.q = var4;
      this.U = var5;
      this.f = var6;
   }

   @Override
   public void valueChanged(TreeSelectionEvent var1) {
      com.c.c(458539089988177193L).setLong(com.c.c(496002419724426617L).get(this), System.currentTimeMillis());
      int var10000 = z7.M();
      Method var10001 = (Method)com.c.c(595819195510091629L).get(com.c.c(496002419724426617L).get(this));
      Object[] var10002 = com.c.f();
      Method var10004 = com.c.d(148691699844242618L);
      Object[] var10003 = var10002;
      var10002 = var10001;
      var10001 = var10004;

      try {
         var31 = (DefaultMutableTreeNode)var10001.invoke(var10002, var10003);
      } catch (InvocationTargetException var12) {
         throw var12.getTargetException();
      }

      DefaultMutableTreeNode var3 = var31;
      int var2 = var10000;
      DefaultMutableTreeNode var13 = var3;
      if (var2 == 0) {
         if (var3 == null) {
            return;
         }

         var13 = var3;
      }

      label145: {
         label146: {
            var14 = var13.equals((DefaultMutableTreeNode)com.c.c(420653482522025527L).get(this));
            if (var2 == 0) {
               if (var14) {
                  Object var15 = com.c.c(631372995965003737L).get(com.c.c(496002419724426617L).get(this));
                  Object[] var32 = com.c.a(com.c.c(420901701771813938L).get(this));
                  Method var54 = com.c.d(262788292718351309L);
                  var10002 = var32;
                  var10001 = (Method)var15;
                  Method var16 = var54;

                  try {
                     var16.invoke(var10001, var10002);
                  } catch (InvocationTargetException var11) {
                     throw var11.getTargetException();
                  }

                  if (var2 == 0) {
                     break label146;
                  }
               }

               var14 = var3.equals((DefaultMutableTreeNode)com.c.c(441510664534739321L).get(this));
            }

            if (var2 == 0) {
               if (var14) {
                  Object var17 = com.c.c(631372995965003737L).get(com.c.c(496002419724426617L).get(this));
                  Object[] var34 = com.c.a(com.c.c(369677556826602915L).get(this));
                  Method var55 = com.c.d(262788292718351309L);
                  var10002 = var34;
                  var10001 = (Method)var17;
                  Method var18 = var55;

                  try {
                     var18.invoke(var10001, var10002);
                  } catch (InvocationTargetException var10) {
                     throw var10.getTargetException();
                  }

                  if (var2 == 0) {
                     break label146;
                  }
               }

               var14 = var3.equals((DefaultMutableTreeNode)com.c.c(140172852301764786L).get(com.c.c(496002419724426617L).get(this)));
            }

            if (var2 == 0) {
               if (var14) {
                  Object var19 = com.c.c(631372995965003737L).get(com.c.c(496002419724426617L).get(this));
                  Object[] var36 = com.c.a(com.c.c(535177121277639390L).get(com.c.c(496002419724426617L).get(this)));
                  Method var56 = com.c.d(262788292718351309L);
                  var10002 = var36;
                  var10001 = (Method)var19;
                  Method var20 = var56;

                  try {
                     var20.invoke(var10001, var10002);
                  } catch (InvocationTargetException var9) {
                     throw var9.getTargetException();
                  }

                  if (var2 == 0) {
                     break label146;
                  }
               }

               var14 = var3.equals((DefaultMutableTreeNode)com.c.c(579289540698555524L).get(com.c.c(496002419724426617L).get(this)));
            }

            if (var2 == 0) {
               if (var14) {
                  Object var21 = com.c.c(631372995965003737L).get(com.c.c(496002419724426617L).get(this));
                  Object[] var38 = com.c.a(com.c.c(543324707110410118L).get(com.c.c(496002419724426617L).get(this)));
                  Method var57 = com.c.d(262788292718351309L);
                  var10002 = var38;
                  var10001 = (Method)var21;
                  Method var22 = var57;

                  try {
                     var22.invoke(var10001, var10002);
                  } catch (InvocationTargetException var8) {
                     throw var8.getTargetException();
                  }

                  if (var2 == 0) {
                     break label146;
                  }
               }

               var14 = var3.equals((DefaultMutableTreeNode)com.c.c(434086940570366327L).get(this));
            }

            if (var2 != 0) {
               break label145;
            }

            if (var14) {
               Object var23 = com.c.c(631372995965003737L).get(com.c.c(496002419724426617L).get(this));
               Object[] var40 = com.c.a(com.c.c(162577328667343549L).get(com.c.c(496002419724426617L).get(this)));
               Method var58 = com.c.d(262788292718351309L);
               var10002 = var40;
               var10001 = (Method)var23;
               Method var24 = var58;

               try {
                  var24.invoke(var10001, var10002);
               } catch (InvocationTargetException var7) {
                  throw var7.getTargetException();
               }
            }
         }

         Object var25 = com.c.c(496002419724426617L).get(this);
         Object[] var42 = com.c.f();
         Method var59 = com.c.d(479940415849799095L);
         var10002 = var42;
         var10001 = (Method)var25;
         Method var26 = var59;

         try {
            var14 = (Boolean)var26.invoke(var10001, var10002);
         } catch (InvocationTargetException var6) {
            throw var6.getTargetException();
         }
      }

      boolean var4 = var14;
      if (var1.getOldLeadSelectionPath() != null) {
      }

      label151: {
         boolean var27 = var4;
         if (var2 == 0) {
            if (var4) {
               break label151;
            }

            var27 = var3.equals((DefaultMutableTreeNode)com.c.c(456154352713079276L).get(com.c.c(496002419724426617L).get(this)));
         }

         if (var27) {
            return;
         }

         Object var28 = com.c.c(496002419724426617L).get(this);
         Object[] var44 = com.c.f();
         Method var60 = com.c.d(511026305189645501L);
         var10002 = var44;
         var10001 = (Method)var28;
         Method var29 = var60;

         try {
            var29.invoke(var10001, var10002);
         } catch (InvocationTargetException var5) {
            throw var5.getTargetException();
         }

         if (var2 == 0) {
            return;
         }
      }

      com.c.c(456154352713079276L).set(com.c.c(496002419724426617L).get(this), var3);
   }
}





