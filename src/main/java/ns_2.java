import java.util.EventObject;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;
import javax.swing.tree.TreeNode;

class ns_2 extends DefaultTreeCellEditor {
   public ns_2(JTree var1, DefaultTreeCellRenderer var2, TreeCellEditor var3) {
      super(var1, var2, var3);
   }

   @Override
   public boolean isCellEditable(EventObject var1) {
      String var10000 = aA.z();
      boolean var3 = super.isCellEditable(var1);
      String var2 = var10000;
      boolean var6 = var3;
      if (var2 == null) {
         label23:
         if (var3) {
            Object var4 = this.tree.getLastSelectedPathComponent();
            var10000 = (String)var4;
            if (var2 == null) {
               if (var4 == null) {
                  break label23;
               }

               var10000 = (String)var4;
            }

            boolean var8 = var10000 instanceof TreeNode;
            if (var2 != null) {
               return var8;
            }

            if (var8) {
               TreeNode var5 = (TreeNode)var4;
               var3 = var5.isLeaf();
            }
         }

         var6 = var3;
      }

      return var6;
   }
}





