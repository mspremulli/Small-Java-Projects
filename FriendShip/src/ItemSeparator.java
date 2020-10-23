class ItemSeparator {

  public static void main(String[] args){
    ItemSeparator test = new ItemSeparator("Bread$$##12.5$$##10");
    System.out.println(test.getName());
    System.out.println(test.getPrice());
    System.out.println(test.getQuantity());
  }
  String name;
  Double price;
  int quantity;
  String rawInput;

  ItemSeparator(String rawInput){
    this.rawInput = rawInput;
    separateInput();
  }

  private void separateInput(){
    String[] inputArray = rawInput.split("\\$\\$##");
    name = inputArray[0];
    price = Double.parseDouble(inputArray[1]);
    quantity = Integer.parseInt(inputArray[2]);
  }

  public String getName(){
    return name;
  }

  public Double getPrice(){
    return price;
  }

  public int getQuantity(){
    return quantity;
  }

}
