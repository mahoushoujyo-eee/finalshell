package com.finalshell.ui.listener;

import com.finalshell.reflect.Ref;
import com.finalshell.reflect.Registry;
import com.finalshell.ui.dialog.EditorSelectionDialog;
import com.finalshell.ui.model.Ck4;
import com.finalshell.ui.model.Tf4;
import com.finalshell.ui.panel.FileBrowserAddressBar;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.lang.reflect.InvocationTargetException;

public class Jt2 implements MouseListener {
   public final int Q;
   public final EditorSelectionDialog s;

   public Jt2(EditorSelectionDialog var1, int var2) {
      this.s = var1;
      this.Q = var2;
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
      boolean var2 = FileBrowserAddressBar.i();
      int var10000 = var1.getClickCount();
      int var10001 = 2;
      if (var2) {
         if (var10000 != 2) {
            return;
         }

         var10000 = var1.getButton();
         var10001 = 1;
      }

      label146: {
         if (var2) {
            if (var10000 != var10001) {
               return;
            }

            if (!var2) {
               break label146;
            }

            var10000 = ((Integer)Ref.g(223296310692614241L, this)).intValue();
            var10001 = ((Integer)Ref.g(317162390314131527L, null)).intValue();
         }

         if (var10000 != var10001) {
            Object var8 = 377989578805733666L;
            Ref.g(377989578805733666L, var8);
            Object var10 = 210562214105886716L;
            int var3 = ((com.finalshell.core.Km2)Ref.g(210562214105886716L, var10)).getSelectedRow();
            label118:
            if (var3 > -1) {
               Object var12 = 377989578805733666L;
               Ref.g(377989578805733666L, var12);
               Object var14 = 210562214105886716L;
               Ref.g(210562214105886716L, var14);
               Object[] var10005 = Registry.packArgs(var3);
               long var17 = 303488344973038628L;
               Object[] var16 = var10005;
               var10005 = Ref.h(303488344973038628L, var16, var17);

               try {
                  var10005 = (Object[])((Object)var10005);
               } catch (InvocationTargetException var64) {
                  throw new RuntimeException(var64.getTargetException());
               }

               Object var72;
               label140: {
                  Object var4 = var10005;
                  boolean var70 = var4.getClass().equals(Ck4.class);
                  if (var2) {
                     if (var70) {
                        Object var18 = 377989578805733666L;
                        Ref.g(377989578805733666L, var18);
                        Object var20 = 210562214105886716L;
                        Ref.g(210562214105886716L, var20);
                        var72 = Registry.packArgs(var3);
                        long var23 = 303488344973038628L;
                        Object[] var22 = (Object[])var72;
                        Ck4 var5 = (Ck4)Ref.h(303488344973038628L, var22, var23);
                        var72 = var5;
                        String var10009 = (String)(Registry.emptyArgs());
                        long var25 = 605430732347023634L;
                        Object var24 = var10009;
                        var10009 = Ref.h(605430732347023634L, var24, var25);

                        try {
                           var10009 = (String)var10009;
                        } catch (InvocationTargetException var63) {
                           throw new RuntimeException(var63.getTargetException());
                        }

                        label110: {
                           String var6 = var10009;
                           File var7 = new File(var6);
                           if (var2) {
                              if (!var7.exists()) {
                                 break label110;
                              }

                              Object var26 = 377989578805733666L;
                              Ref.g(377989578805733666L, var26);
                              long var29 = 518641299092321834L;
                              Ref.s(518641299092321834L, var6, var29);
                              Object var30 = 377989578805733666L;
                              Ref.setInt(633665384138343849L, Ref.g(377989578805733666L, var30), ((Integer)Ref.g(564170828581134815L, null)).intValue());
                           }

                           Object var32 = 377989578805733666L;
                           ((EditorSelectionDialog)Ref.g(377989578805733666L, var32)).setVisible(false);
                        }

                        if (var2) {
                           break label118;
                        }
                     }

                     Class var71 = var4.getClass();
                     if (!var2) {
                        break label140;
                     }

                     var70 = var71.equals(Tf4.class);
                  }

                  if (!var70) {
                     break label118;
                  }

                  Object var34 = 377989578805733666L;
                  Ref.g(377989578805733666L, var34);
                  Object var36 = 210562214105886716L;
                  Ref.g(210562214105886716L, var36);
                  var72 = Registry.packArgs(var3);
                  long var39 = 303488344973038628L;
                  Object[] var38 = (Object[])var72;
                  var72 = Ref.h(303488344973038628L, var38, var39);

                  try {
                     var72 = var72;
                  } catch (InvocationTargetException var62) {
                     throw new RuntimeException(var62.getTargetException());
                  }
               }

               Tf4 var65 = (Tf4)var72;
               String var77 = (String)(Registry.emptyArgs());
               long var41 = 498856411508641826L;
               Object var40 = var77;
               var77 = Ref.h(498856411508641826L, var40, var41);

               try {
                  var77 = (String)var77;
               } catch (InvocationTargetException var61) {
                  throw new RuntimeException(var61.getTargetException());
               }

               String var66 = var77;
               File var67 = new File(var66);
               Registry.emptyArgs();
               long var42 = 454647487873911743L;
               Object var10010 = Ref.h2(454647487873911743L, var42);

               try {
                  var10010 = (Boolean)var10010;
               } catch (InvocationTargetException var60) {
                  throw new RuntimeException(var60.getTargetException());
               }

               if (var2) {
                  if (var10010 == null) {
                     break label118;
                  }

                  var10010 = Registry.packArgs(var67);
                  long var44 = 401544505347980134L;
                  Object var10011 = Ref.h2(401544505347980134L, var44);

                  try {
                  } catch (InvocationTargetException var59) {
                     throw new RuntimeException(var59.getTargetException());
                  }
               }

               if (var10010 == null) {
                  Object var46 = 377989578805733666L;
                  Ref.g(377989578805733666L, var46);
                  long var49 = 518641299092321834L;
                  Ref.s(518641299092321834L, var66, var49);
                  Object var50 = 377989578805733666L;
                  Ref.setInt(633665384138343849L, Ref.g(377989578805733666L, var50), ((Integer)Ref.g(564170828581134815L, null)).intValue());
                  Object var52 = 377989578805733666L;
                  ((EditorSelectionDialog)Ref.g(377989578805733666L, var52)).setVisible(false);
               }
            }

            if (var2) {
               return;
            }
         }
      }

      Object var54 = 377989578805733666L;
      Ref.g(377989578805733666L, var54);
      Object[] var10002 = Registry.emptyArgs();
      long var57 = 190925019033578435L;
      Object[] var56 = var10002;
      Ref.h(190925019033578435L, var56, var57);

      try {
         ;
      } catch (InvocationTargetException var58) {
         throw new RuntimeException(var58.getTargetException());
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
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
}





