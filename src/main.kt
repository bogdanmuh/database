
fun main(){
    /*val a11=0.32 ; val a12=-0.18 ; val a13=0.02 ; val a14=0.21
    val a21 = 0.16 ; val a22=0.12 ; val a23=-0.14 ; val a24= 0.27
    val a31=0.37 ; val a32=0.27 ; val a33=-0.02 ; val a34= -0.24
    val a41=0.12 ; val a42=0.21 ; val a43=-0.18 ; val a44=0.25
    val b1=1.83 ; val b2=-0.65 ; val b3=2.23 ; val b4=-1.13 */

    val a11=0 ; val a12=0.9042 ; val a13=0.0137
    val a21=0 ; val a22=-0.0264  ; val a23=-0.08641
    val a31=0 ; val a32=0.4521; val a33=-0.0398

/*
    val a11=0 ; val a12=0.041 ; val a13=-0.4576 ; val a14=0
    val a21=0 ; val a22=-0.033  ; val a23=0.287  ; val a24= 0
    val a31=0 ; val a32=-0.005; val a33=-0.017  ; val a34= 0
    val a41=0 ; val a42=0 ; val a43=0 ; val a44=0


 */
    val b1=-1.4248 ; val b2=-4.5684 ; val b3=-0.806

    var nx1=0.0
    var nx2=0.0
    var nx3=0.0
    //var nx4=0.0

    fun getNewResult(x1:Double, x2:Double, x3:Double){
        nx1=a11*x1+a12*x2+a13*x3+b1
        nx2=a21*x1+a22*x2+a23*x3+b2
        nx3=a31*x1+a32*x2+a33*x3+b3
        //nx4=a41*x1+a42*x2+a43*x3+a44*x4+b4

    }

    val iteratsii=128

    for(i in 0 .. iteratsii){
        getNewResult(nx1,nx2,nx3)
    }
    println(nx1.toString()+"\n"+nx2.toString()+"\n"+nx3.toString())
}
