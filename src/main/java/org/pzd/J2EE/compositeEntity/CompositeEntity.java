package org.pzd.J2EE.compositeEntity;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
