class ProductOfNumbers {

    List<Integer> list = new ArrayList<>();

    public ProductOfNumbers() 
    {
        
    }
    
    public void add(int num) 
    {
        list.add(num);
    }
    
    public int getProduct(int k) 
    {
        int range = list.size()-k, product = 1;
        if(range < 0) return 0;
        for(int i = list.size()-1; i >= range; i--)
        {
            product *= list.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */