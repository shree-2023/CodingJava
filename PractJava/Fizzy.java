class Fizzy{
    public static int Numprint(int n){
   for(int i=0;i<=n;i++){
    if(i%3==0 && i%5==0){
        System.out.println("FizzBuzz");
    }
    else if(i%3==0){
        System.out.println("Buzz");

    }
    else if(i%5==0){
        System.out.println("Buzz");

    }
    else{
        System.out.println(i);

    }

}
return n;
    }
    public static void main(String[] args) {
        int n=100;
        System.out.print(Numprint(n));
        
    }
}