public class Main{
    public static void main(String args[]){
        Array arr = new ReverseArray(3);
        System.out.println(arr.add(34));
        System.out.println(arr.add(5));
        System.out.println(arr.add(54));
        int [] temp = arr.getData();
        for(int x: temp){
            System.out.println(x);
        }
    }
}


class Array{
    private int data[]; //����һ������
    int foot;
    public Array(int len){ //��С
        if(len > 0){ //������Ԫ��
            this.data = new int[len];
        }else{
            this.data = new int[1]; //һ��Ԫ�صĴ�С
        }
    }
    public boolean add(int num){
        if(this.foot < this.data.length) { //�пռ䱣��
            this.data[foot++] = num;
            return true;
        }
        return false; //����ʧ��
    }
    public int[] getData(){
        return this.data;
    }
}

//����һ��������������
class SortArray extends Array{
    public SortArray(int len){
        super(len);
    }
    public int[] getData(){ //����
        java.util.Arrays.sort(super.getData());
        return super.getData();
    }

}



//��ת��
class ReverseArray extends Array{
    public ReverseArray(int len){
        super(len);
    }
    public int[] getData(){
        int center = super.getData().length / 2;
        int head = 0;
        int tail = super.getData().length - 1;
        for(int x = 0;x<center;x++){
            int temp = super.getData()[head];
            super.getData()[head] = super.getData()[tail];
            super.getData()[tail] =temp;
            head ++ ;
            tail -- ;
        }
        return super.getData();
    }

}
