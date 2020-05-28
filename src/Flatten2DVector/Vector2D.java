package Flatten2DVector;

public class Vector2D {

    public int[][] vector2d;
    public int i = 0;
    public int j = -1;
    public boolean nullFlag = false;

    public Vector2D(int[][] v) {
        this.vector2d = v;
        if (this.vector2d.length==0){
            nullFlag = true;
        }
    }

    public int next() {
        if (this.j+1 < vector2d[this.i].length){
            this.j+=1;
            return this.vector2d[this.i][this.j];
        }else {
            this.i +=1;
            this.j = -1;
            return this.next();
        }
    }

    public boolean hasNext() {
        if (nullFlag){
            return false;
        }
        int i = this.i;
        int j = this.j;
        if (j+1 < vector2d[i].length){
            return true;
        }else {
            while (i+1 < vector2d.length && vector2d[i+1].length<1){
                i+=1;
            }
            if (i+1 < vector2d.length){
                return true;
            }else {
                return false;
            }
        }
    }
}

/**
 * Your Vector2D object will be instantiated and called as such:
 * Vector2D obj = new Vector2D(v);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
