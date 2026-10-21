package com.finalshell.ui.listener;

import com.finalshell.core.L9;
import com.finalshell.core.T32;
import com.finalshell.core.UA3;
import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.panel.F5;
import com.finalshell.ui.panel.RouteTracePanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class O52 implements MouseListener {
   public final F5 A;
   public final JMenuItem o;
   public final JMenuItem O;
   public final JPopupMenu p;
   public final RouteTracePanel x;
   public static String a;

   public O52(RouteTracePanel var1, F5 var2, JMenuItem var3, JMenuItem var4, JPopupMenu var5) {
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
      Object var11 = 214580066592956052L;
      Ref.g(214580066592956052L, var11);
      Object var13 = 266946451169580014L;
      int var7 = ((UA3)Ref.g(266946451169580014L, var13)).rowAtPoint(var1.getPoint());
      Object var15 = 214580066592956052L;
      Ref.g(214580066592956052L, var15);
      Object var17 = 266946451169580014L;
      int var8 = ((UA3)Ref.g(266946451169580014L, var17)).convertRowIndexToModel(var7);
      if (var7 > -1) {
         Object var19 = 214580066592956052L;
         Ref.g(214580066592956052L, var19);
         Object var21 = 434008521855552520L;
         Ref.g(434008521855552520L, var21);
         ArrayList var10007 = Registry.emptyArgs();
         long var24 = 508702504224153155L;
         Object[] var23 = var10007;
         var10007 = Ref.h(508702504224153155L, var23, var24);

         try {
            var10007 = (ArrayList)var10007;
         } catch (InvocationTargetException var78) {
            throw var78.getTargetException();
         }

         var3 = (L9)var10007.get(var7);
         String var10008 = (String)(Registry.emptyArgs());
         long var26 = 564648154927582737L;
         Object[] var25 = var10008;
         var10008 = Ref.h(564648154927582737L, var25, var26);

         try {
            var10008 = (String)var10008;
         } catch (InvocationTargetException var77) {
            throw var77.getTargetException();
         }

         var4 = var10008;
         String var10009 = (String)(Registry.emptyArgs());
         long var28 = 129926512000439480L;
         Object[] var27 = var10009;
         var10009 = Ref.h(129926512000439480L, var27, var28);

         try {
            var10009 = (String)var10009;
         } catch (InvocationTargetException var76) {
            throw var76.getTargetException();
         }

         var5 = var10009;
      }

      int var10004 = var1.getButton();
      byte var10005 = 1;
      if (var2 == null) {
         if (var10004 == 1) {
            if (var4 == null) {
               return;
            }

            Object var29 = 401945019204193297L;
            Ref.g(401945019204193297L, var29);
            Object[] var10006 = Registry.emptyArgs();
            long var32 = 629411790963347134L;
            Object[] var31 = var10006;
            Ref.h(629411790963347134L, var31, var32);

            try {
               ;
            } catch (InvocationTargetException var75) {
               throw var75.getTargetException();
            }

            Object[] var84 = Registry.emptyArgs();
            long var34 = 127422501806576014L;
            Object[] var33 = var84;
            var84 = Ref.h(127422501806576014L, var33, var34);

            try {
               var86 = (Integer)var84;
            } catch (InvocationTargetException var74) {
               throw var74.getTargetException();
            }

            var84 = Registry.packArgs(var86);
            long var36 = 578241708662169341L;
            Object[] var35 = var84;
            var84 = Ref.h(578241708662169341L, var35, var36);

            try {
               var84 = (T32)var84;
            } catch (InvocationTargetException var73) {
               throw var73.getTargetException();
            }

            label153: {
               label141: {
                  T32 var10 = var84;
                  if (var2 == null) {
                     if (var10 == null) {
                        break label141;
                     }

                     Object[] var92 = Registry.emptyArgs();
                     long var38 = 187894907200639463L;
                     Object[] var37 = var92;
                     Ref.h(187894907200639463L, var37, var38);
                     Object[] var10010 = Registry.packArgs(var10);
                     long var40 = 176011466134249595L;
                     Object[] var39 = var10010;
                     Ref.h(176011466134249595L, var39, var40);

                     try {
                        ;
                     } catch (InvocationTargetException var72) {
                        throw var72.getTargetException();
                     }
                  }

                  if (var2 == null) {
                     break label153;
                  }
               }

               new StringBuilder();
               Object[] var10012 = Registry.emptyArgs();
               long var42 = 127422501806576014L;
               Object[] var41 = var10012;
               var10012 = Ref.h(127422501806576014L, var41, var42);

               try {
                  var95 = (Integer)var10012;
               } catch (InvocationTargetException var71) {
                  throw var71.getTargetException();
               }

               true.append(var3 + var95).append(a);
               var10012 = Registry.emptyArgs();
               long var44 = 564648154927582737L;
               Object[] var43 = var10012;
               var10012 = Ref.h(564648154927582737L, var43, var44);

               try {
                  var10012 = (String)var10012;
               } catch (InvocationTargetException var70) {
                  throw var70.getTargetException();
               }

               var3.append((String)var10012).toString();
               Object[] var10013 = Registry.emptyArgs();
               long var46 = 564648154927582737L;
               Object[] var45 = var10013;
               var10013 = Ref.h(564648154927582737L, var45, var46);
               Object[] var10015 = Registry.emptyArgs();
               long var48 = 127422501806576014L;
               Object[] var47 = var10015;
               var10015 = Ref.h(127422501806576014L, var47, var48);

               try {
                  var102 = (Integer)var10015;
               } catch (InvocationTargetException var69) {
                  throw var69.getTargetException();
               }

               var10013 = Registry.packArgs(var10013, var3, var102);
               long var50 = 411401147617277002L;
               Object[] var49 = var10013;
               Ref.h(411401147617277002L, var49, var50);
            }

            if (var2 == null) {
               return;
            }
         }

         var10004 = var1.getButton();
         var10005 = 3;
      }

      if (var10004 == var10005) {
         label125: {
            if (var2 == null) {
               Object var51 = 214580066592956052L;
               Ref.g(214580066592956052L, var51);
               Object var53 = 266946451169580014L;
               ((UA3)Ref.g(266946451169580014L, var53)).getSelectionModel().setSelectionInterval(var8, var8);
               if (var5 != null) {
                  Object var55 = 591279365608582787L;
                  ((JMenuItem)Ref.g(591279365608582787L, var55)).setEnabled(true);
                  if (var2 == null) {
                     break label125;
                  }
               }
            }

            Object var57 = 591279365608582787L;
            ((JMenuItem)Ref.g(591279365608582787L, var57)).setEnabled(false);
         }

         label118: {
            if (var4 != null) {
               Object var59 = 388974815421607484L;
               ((JMenuItem)Ref.g(388974815421607484L, var59)).setEnabled(true);
               if (var2 == null) {
                  break label118;
               }
            }

            Object var61 = 388974815421607484L;
            ((JMenuItem)Ref.g(388974815421607484L, var61)).setEnabled(false);
         }

         Object var63 = 305307581744811637L;
         JPopupMenu var81 = (JPopupMenu)Ref.g(305307581744811637L, var63);
         Object var65 = 214580066592956052L;
         Object var93 = Ref.g(214580066592956052L, var65);
         Object var67 = 266946451169580014L;
         var93.show((UA3)Ref.g(266946451169580014L, var67), var1.getX(), var1.getY());
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

   static {
      __vfClinit__();
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   public static void __vfClinit__() {
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





