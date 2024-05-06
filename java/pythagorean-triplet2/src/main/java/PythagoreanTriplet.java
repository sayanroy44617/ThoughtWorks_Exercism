import java.util.*;

class PythagoreanTriplet {

    private static int a;
    private static int b;
    private static int c;

    private int sum = 0 ;
    private int maxFactor = Integer.MAX_VALUE;
    List<PythagoreanTriplet> pythagoreanTripletList ;


    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private PythagoreanTriplet()
    {
      pythagoreanTripletList = new ArrayList<>();
    }

    static PythagoreanTriplet makeTripletsList() {
        return new PythagoreanTriplet();
    }



    PythagoreanTriplet thatSumTo(int sum) {
            this.sum = sum;
            return this;
    }

    PythagoreanTriplet withFactorsLessThanOrEqualTo(int maxFactor) {
            this.maxFactor = maxFactor;
            return this;
    }


    public List<PythagoreanTriplet> build() {
        for (a=1;a < sum/3; a++){
            for (b=a+1; b <= sum/2; b++){
                double c2 = Math.sqrt(a*a + b*b);
                c = (int) c2;
                if (c > maxFactor)
                    break;
                if (c > b && c2 - c == 0))
                    if (a+b+c == sum)
                        pythagoreanTripletList.add(new PythagoreanTriplet(a, b, c));
            }
        }
        return pythagoreanTripletList;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return super.equals(obj);
        PythagoreanTriplet triplet = (PythagoreanTriplet) obj;
        return  (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }

}