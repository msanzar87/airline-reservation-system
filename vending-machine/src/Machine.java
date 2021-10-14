public class Machine {
    Item[][] items;

    public Machine(Item[][] items){
        this.items = items;
                /*
                new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[0].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }

                 */
    }

    public Item getItem(int row, int spot){
        return this.items[row][spot];
    }

    public void setItem(Item item, int row, int spot){
        this.items[row][spot] = new Item(item);
    }
    public boolean dispense(int row, int spot){
        if (this.items[row][spot].getQuantity() > 0){
            this.items[row][spot].setQuantity(this.items[row][spot].getQuantity() - 1);
            System.out.println("Here is your "+getItem(row,spot).getName()+"! Quantity left: "+getItem(row,spot).getQuantity());
            return true;
        }
        System.out.println("Sold out!");
        return false;
    }
    public String toString(){
        String temp = "";
        for (int i = 0; i < items.length; i++) {
            temp += "\t";
            for (int j = 0; j < items[i].length; j++) {
                temp += this.items[i][j].toString();
            }
            temp += "\n\n";
        }
        temp += "************************************************************";
        return temp;
    }


    }

