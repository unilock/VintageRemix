// InitialInventory

player.testingStartingItems = false // Enable this to have the items be given every time you join the world. Use in testing only.
player.replaceDefaultInventory = false // Enable this to replace any existing items with GroovyScript's starting inventory items.

player.addStartingItem(item('minecraft:stone_sword'), 0)
player.addStartingItem(item('minecraft:stone_pickaxe'), 1)
player.addStartingItem(item('minecraft:stone_axe'), 2)
player.addStartingItem(item('minecraft:stone_shovel'), 3)
player.addStartingItem(item('fruitphone:handheld', 1), 7)
player.addStartingItem(item('antiqueatlas:empty_antique_atlas'), 8)

crafting.addShapeless(akashicTome, [item('minecraft:book')])
