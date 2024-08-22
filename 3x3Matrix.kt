// 3X3 Matrix
fun main(){
    var matrix  = arrayOf( arrayOf(1,2,3), arrayOf(4,5,6), arrayOf(2,1,4));
    for (row in matrix){
        for( element in row) {
            print("${element} ");
        }
        println();
    }
}
