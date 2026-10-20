/*
 * Decompiled with CFR 0.152.
 */
import com.c;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

class TL
implements ActionListener {
    final F6 W;

    TL(F6 f62) {
        this.W = f62;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        block5: {
            ArrayList arrayList;
            block4: {
                boolean bl = F6.g();
                arrayList = (ArrayList)this.W.g;
                if (bl) break block4;
                if (arrayList.size() <= 1) break block5;
                arrayList = ((ArrayList)this.W.g).get(((ArrayList)this.W.g).size() - 2);
            }
            String string = (String)((Object)arrayList);
            this.W.W = string;
            ((dv_0)this.W.J).setCaretPosition(((dv_0)this.W.J).getDocument().getLength());
            try {
                yt_1.F.J(new yq_0(this, string));
            }
            catch (InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        }
    }
}

