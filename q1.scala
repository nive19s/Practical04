
object P3{

  var Inventory_item: Array[String] = Array("Rice","Sugar","Flour")
  var Inventory_quantity: Array[Int] = Array(5,12,8)

  def restock(item: String, quantity: Int): Unit = {
    var found = false
    for (i <- Inventory_item.indices) {
      if (item == Inventory_item(i)) {
        Inventory_quantity(i) += quantity
        found = true
      }
    }
    if (!found) {
      println("Item Does not exists")
    }
  }

  def sellitem(item: String, quantity: Int): Unit = {
    var found = false
    for (i <- Inventory_item.indices) {
      if (item == Inventory_item(i)) {
        if (quantity > Inventory_quantity(i)) {
          println("Quantity is not enough")
          found=true
        } else {
          Inventory_quantity(i) -= quantity
          found = true
        }
      }
    }
    if (!found) {
      println("Item Does not exists ")
    }
  }

  def displayinventory(): Unit = {
    for (i <- Inventory_item.indices) {
      println(s"Item name: ${Inventory_item(i)}, quantity: ${Inventory_quantity(i)} Kg")
    }
  }
def main(args: Array[String]): Unit = {
  displayinventory()
  restock("Rice", 3)
  sellitem("Sugar", 2)
  println("After restocking and selling")
  displayinventory()
  restock("dhall", 5)
  sellitem("Flour", 10)
}
}