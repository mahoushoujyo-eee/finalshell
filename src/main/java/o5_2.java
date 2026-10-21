import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

class o5_2 implements MouseListener {
   final F5 A;
   final JMenuItem o;
   final JMenuItem O;
   final JPopupMenu p;
   final f3_2 x;
   private static final String a;

   o5_2(f3_2 var1, F5 var2, JMenuItem var3, JMenuItem var4, JPopupMenu var5) {
      this.x = var1;
      this.A = var2;
      this.o = var3;
      this.O = var4;
      this.p = var5;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      int[] var10000 = L9.X();
      L9 var3 = null;
      int[] var2 = var10000;
      String var4 = null;
      String var5 = null;
      Object var6 = null;
      int var7 = ((uA_3)com.c.c(266946451169580014L).get(com.c.c(214580066592956052L).get(this))).rowAtPoint(var1.getPoint());
      int var8 = ((uA_3)com.c.c(266946451169580014L).get(com.c.c(214580066592956052L).get(this))).convertRowIndexToModel(var7);
      if (var7 > -1) {
         var10000 = (int[])com.c.c(434008521855552520L).get(com.c.c(214580066592956052L).get(this));
         Object[] var10001 = com.c.f();
         Method var10003 = com.c.d(508702504224153155L);
         Object[] var10002 = var10001;
         var10001 = var10000;
         Method var25 = var10003;

         try {
            var26 = (ArrayList)var25.invoke(var10001, var10002);
         } catch (InvocationTargetException var23) {
            throw var23.getTargetException();
         }

         var3 = (L9)var26.get(var7);
         var10001 = com.c.f();
         var10003 = com.c.d(564648154927582737L);
         var10002 = var10001;
         L9 var44 = var3;
         Method var27 = var10003;

         try {
            var28 = (String)var27.invoke(var44, var10002);
         } catch (InvocationTargetException var22) {
            throw var22.getTargetException();
         }

         var4 = var28;
         var10001 = com.c.f();
         var10003 = com.c.d(129926512000439480L);
         var10002 = var10001;
         L9 var46 = var3;
         Method var29 = var10003;

         try {
            var30 = (String)var29.invoke(var46, var10002);
         } catch (InvocationTargetException var21) {
            throw var21.getTargetException();
         }

         var5 = var30;
      }

      int var31 = var1.getButton();
      int var47 = 1;
      if (var2 == null) {
         if (var31 == 1) {
            if (var4 == null) {
               return;
            }

            var10000 = (int[])com.c.c(401945019204193297L).get(this);
            Object[] var48 = com.c.f();
            Method var78 = com.c.d(629411790963347134L);
            Object[] var65 = var48;
            Object var49 = var10000;
            Method var33 = var78;

            try {
               var34 = (fY_3)var33.invoke(var49, var65);
            } catch (InvocationTargetException var20) {
               throw var20.getTargetException();
            }

            fY_3 var9 = var34;
            var65 = com.c.f();
            Method var10004 = com.c.d(127422501806576014L);
            Object[] var79 = var65;
            L9 var67 = var3;
            Method var50 = var10004;

            try {
               var47 = (Integer)var50.invoke(var67, var79);
            } catch (InvocationTargetException var19) {
               throw var19.getTargetException();
            }

            Object[] var52 = com.c.a(var47);
            var78 = com.c.d(578241708662169341L);
            var65 = var52;
            fY_3 var53 = var9;
            Method var35 = var78;

            try {
               var36 = (t3_2)var35.invoke(var53, var65);
            } catch (InvocationTargetException var18) {
               throw var18.getTargetException();
            }

            label168: {
               label156: {
                  t3_2 var10 = var36;
                  if (var2 == null) {
                     if (var10 == null) {
                        break label156;
                     }

                     Object[] var54 = com.c.f();
                     var78 = com.c.d(187894907200639463L);
                     var65 = var54;
                     fY_3 var55 = var9;
                     Method var37 = var78;

                     try {
                        var10000 = (int[])var37.invoke(var55, var65);
                     } catch (InvocationTargetException var17) {
                        throw var17.getTargetException();
                     }

                     Object[] var56 = com.c.a(var10);
                     var78 = com.c.d(176011466134249595L);
                     var65 = var56;
                     Object var57 = var10000;
                     Method var39 = var78;

                     try {
                        var39.invoke(var57, var65);
                     } catch (InvocationTargetException var16) {
                        throw var16.getTargetException();
                     }
                  }

                  if (var2 == null) {
                     break label168;
                  }
               }

               StringBuilder var58 = new StringBuilder();
               Object[] var92 = com.c.f();
               Method var10006 = com.c.d(127422501806576014L);
               Object[] var10005 = var92;
               L9 var93 = var3;
               var78 = var10006;

               try {
                  var84 = (Integer)var78.invoke(var93, var10005);
               } catch (InvocationTargetException var15) {
                  throw var15.getTargetException();
               }

               StringBuilder var59 = var58.append(1 + var84).append(a);
               Object[] var85 = com.c.f();
               Method var98 = com.c.d(564648154927582737L);
               Object[] var94 = var85;
               L9 var86 = var3;
               Method var71 = var98;

               try {
                  var65 = (String)var71.invoke(var86, var94);
               } catch (InvocationTargetException var14) {
                  throw var14.getTargetException();
               }

               String var60 = var59.append((String)var65).toString();
               Object[] var87 = com.c.f();
               Method var99 = com.c.d(564648154927582737L);
               Object[] var95 = var87;
               L9 var88 = var3;
               Method var73 = var99;

               try {
                  var65 = (Object[])var73.invoke(var88, var95);
               } catch (InvocationTargetException var13) {
                  throw var13.getTargetException();
               }

               Object[] var96 = com.c.f();
               var10006 = com.c.d(127422501806576014L);
               var10005 = var96;
               L9 var97 = var3;
               var78 = var10006;

               try {
                  var90 = (Integer)var78.invoke(var97, var10005);
               } catch (InvocationTargetException var12) {
                  throw var12.getTargetException();
               }

               Object[] var61 = com.c.a(var60, var65, var90);
               var78 = com.c.d(411401147617277002L);
               var65 = var61;
               fY_3 var62 = var9;
               Method var40 = var78;

               try {
                  var40.invoke(var62, var65);
               } catch (InvocationTargetException var11) {
                  throw var11.getTargetException();
               }
            }

            if (var2 == null) {
               return;
            }
         }

         var31 = var1.getButton();
         var47 = 3;
      }

      if (var31 == var47) {
         label140: {
            o5_2 var41 = this;
            if (var2 == null) {
               ((uA_3)com.c.c(266946451169580014L).get(com.c.c(214580066592956052L).get(this))).getSelectionModel().setSelectionInterval(var8, var8);
               if (var5 != null) {
                  ((JMenuItem)com.c.c(591279365608582787L).get(this)).setEnabled(true);
                  if (var2 == null) {
                     break label140;
                  }
               }

               var41 = this;
            }

            ((JMenuItem)com.c.c(591279365608582787L).get(var41)).setEnabled(false);
         }

         label133: {
            if (var4 != null) {
               ((JMenuItem)com.c.c(388974815421607484L).get(this)).setEnabled(true);
               if (var2 == null) {
                  break label133;
               }
            }

            ((JMenuItem)com.c.c(388974815421607484L).get(this)).setEnabled(false);
         }

         ((JPopupMenu)com.c.c(305307581744811637L).get(this))
            .show((uA_3)com.c.c(266946451169580014L).get(com.c.c(214580066592956052L).get(this)), var1.getX(), var1.getY());
      }
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   static {
      char[] var10003 = "90".toCharArray();
      int var10004 = var10003.length;
      int var0 = 0;
      byte var6 = 57;
      char[] var10002 = var10003;
      int var1 = var10004;
      byte var10;
      char[] var10005;
      int var10006;
      if (var10004 <= 1) {
         var10005 = var10003;
         var10 = 57;
         var10006 = var0;
      } else {
         var6 = 57;
         var1 = var10004;
         if (var10004 <= var0) {
            String var9 = new String(var10003).intern();
            byte var4 = -1;
            a = var9;
            return;
         }

         var10005 = var10003;
         var10 = 57;
         var10006 = var0;
      }

      while (true) {
         char var22 = var10005[var10006];
         byte var23;
         switch (var0 % 7) {
            case 0:
               var23 = 35;
               break;
            case 1:
               var23 = 41;
               break;
            case 2:
               var23 = 86;
               break;
            case 3:
               var23 = 45;
               break;
            case 4:
               var23 = 56;
               break;
            case 5:
               var23 = 54;
               break;
            default:
               var23 = 97;
         }

         var10005[var10006] = (char)(var22 ^ var10 ^ var23);
         var0++;
         if (var6 == 0) {
            var10006 = var6;
            var10005 = var10002;
            var10 = var6;
         } else {
            if (var1 <= var0) {
               String var8 = new String(var10002).intern();
               byte var3 = -1;
               a = var8;
               return;
            }

            var10005 = var10002;
            var10 = var6;
            var10006 = var0;
         }
      }
   }
}





