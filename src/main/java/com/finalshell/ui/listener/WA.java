package com.finalshell.ui.listener;

import com.finalshell.core.FN;
import com.finalshell.core.GR;
import com.finalshell.ui.model.CB3;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class WA implements MouseListener, KeyListener {
   final com.finalshell.ui.panel.U3 n;

   protected WA(com.finalshell.ui.panel.U3 var1) {
      this.n = var1;
   }

   @Override
   public void keyPressed(KeyEvent var1) {
      String[] var2 = CB3.C$arrString();
      int var10000 = (this.n.b()) ? 1 : 0;
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = (GR.rN.J(var1)) ? 1 : 0;
      }

      if (var10000) {
         List var3 = this.n.V();
         Iterator var4 = var3.iterator();

         label39: {
            while (var4.hasNext()) {
               DefaultMutableTreeNode var5 = (DefaultMutableTreeNode)var4.next();
               var10000 = (this.n.R(var5)) ? 1 : 0;
               if (var2 == null) {
                  break label39;
               }

               label35: {
                  label34: {
                     if (var2 != null) {
                        if (var10000 == 0) {
                           break label34;
                        }

                        var10000 = (this.n.N(var5)) ? 1 : 0;
                     }

                     if (var10000 != 0) {
                        break label35;
                     }
                  }

                  var4.remove();
               }

               if (var2 == null) {
                  break;
               }
            }

            var10000 = var3.size();
         }

         if (var10000 > 0) {
            this.n.i(var3);
         }
      }
   }

   @Override
   public void mousePressed(MouseEvent var1) {
      String[] var2 = CB3.C$arrString();
      boolean var10000 = this.n.b();
      if (var2 != null) {
         if (!var10000) {
            return;
         }

         var10000 = FN.B(var1);
      }

      if (var10000) {
         DefaultMutableTreeNode var3 = this.n.q(var1.getPoint());
         if (var3 != null) {
            DefaultMutableTreeNode var10001;
            label38: {
               var10000 = this.n.R(var3);
               if (var2 != null) {
                  if (!var10000) {
                     return;
                  }

                  var6 = this.n;
                  var10001 = var3;
                  if (var2 == null) {
                     break label38;
                  }

                  var10000 = this.n.N(var3);
               }

               if (!var10000) {
                  return;
               }

               var6 = this.n;
               var10001 = var3;
            }

            Rectangle var4 = var6.O$Rectangle(var10001);
            if (var4.contains(var1.getPoint())) {
               this.n.E(var3);
            }
         }
      }
   }

   @Override
   public void keyTyped(KeyEvent var1) {
   }

   @Override
   public void keyReleased(KeyEvent var1) {
   }

   @Override
   public void mouseClicked(MouseEvent var1) {
   }

   @Override
   public void mouseReleased(MouseEvent var1) {
   }

   @Override
   public void mouseEntered(MouseEvent var1) {
   }

   @Override
   public void mouseExited(MouseEvent var1) {
   }
}





