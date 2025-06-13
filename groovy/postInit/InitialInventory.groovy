// InitialInventory

player.testingStartingItems = false // Enable this to have the items be given every time you join the world. Use in testing only.
player.replaceDefaultInventory = false // Enable this to replace any existing items with GroovyScript's starting inventory items.

player.addStartingItem(item('minecraft:stone_sword'))
player.addStartingItem(item('minecraft:stone_pickaxe'))
player.addStartingItem(item('minecraft:stone_axe'))
player.addStartingItem(item('minecraft:stone_shovel'))

//player.addStartingItem(item('fruitphone:handheld', 1))

def akashicTome = item('akashictome:tome').withNbt([
	'akashictome:data': [
		'arcanearchives': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'arcanearchives:tome_arcana',
			'tag': [
				'akashictome:definedMod': 'arcanearchives',
				'Book': 'arcanearchives:xml/tome.xml'
			]
		],
		'bloodarsenal': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:bloodarsenal-guide',
			'tag': [
				'akashictome:definedMod': 'bloodarsenal'
			]
		],
		'buildcraftlib': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'buildcraftlib:guide',
			'tag': [
				'akashictome:definedMod': 'buildcraftlib'
			]
		],
		'correlated': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'correlated:doc_tablet',
			'tag': [
				'akashictome:definedMod': 'correlated'
			]
		],
		// 'crossroads': [
		// 	'Count': 1 as byte,
		// 	'Damage': 0 as short,
		// 	'id': 'guideapi:crossroads-info_guide',
		// 	'tag': [
		// 		'akashictome:definedMod': 'crossroads'
		// 	]
		// ],
		'ee': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'ee:end_info_book',
			'tag': [
				'akashictome:definedMod': 'ee',
			]
		],
		'engineersdecor': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'engineersdecor',
				'patchouli:book': 'engineersdecor:engineersdecor_manual'
			]
		],
		'essentialcraft': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'essentialcraft:research_book',
			'tag': [
				'akashictome:definedMod': 'essentialcraft',
			]
		],
		'extrautils2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'extrautils2:book',
			'tag': [
				'akashictome:definedMod': 'extrautils2'
			]
		],
		'forestry': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'forestry:book_forester',
			'tag': [
				'akashictome:definedMod': 'forestry'
			]
		],
		'mahoutsukai': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'mahoutsukai:guidebook',
			'tag': [
				'akashictome:definedMod': 'mahoutsukai'
			]
		],
		'naturesaura': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'naturesaura',
				'patchouli:book': 'naturesaura:book'
			]
		],
		'ncsteamadditions': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'ncsteamadditions',
				'patchouli:book': 'ncsteamadditions:guide'
			]
		],
		'nuclearcraft': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'nuclearcraft',
				'patchouli:book': 'nuclearcraft:guide'
			]
		],
		'opencomputers': [
			'Count': 1 as byte,
			'Damage': 4 as short,
			'id': 'opencomputers:tool',
			'tag': [
				'akashictome:definedMod': 'opencomputers'
			]
		],
		'practicallogistics2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'practicallogistics2:plguide',
			'tag': [
				'akashictome:definedMod': 'practicallogistics2'
			]
		],
		'qmd': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'qmd',
				'patchouli:book': 'qmd:guide'
			]
		],
		'quiverbow_restrung': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'quiverbow_restrung',
				'patchouli:book': 'quiverbow_restrung:weaponsmiths_journal'
			]
		],
		'roots': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'roots:roots_guide',
			'tag': [
				'akashictome:definedMod': 'roots'
			]
		],
		'theaurorian': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'theaurorian',
				'patchouli:book': 'theaurorian:the_aurorian_guide'
			]
		],
		'thebetweenlands': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'thebetweenlands:manual_hl',
			'tag': [
				'akashictome:definedMod': 'thebetweenlands'
			]
		],
		'tis3d': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'tis3d:book_manual',
			'tag': [
				'akashictome:definedMod': 'tis3d'
			]
		],
		'twilightforest': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'twilightforest',
				'patchouli:book': 'twilightforest:guide'
			]
		],
		'uniquecrops': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'uniquecrops:bookmultiblock',
			'tag': [
				'akashictome:definedMod': 'uniquecrops',
			]
		],
		'uniquecrops1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'uniquecrops:generic',
			'tag': [
				'akashictome:definedMod': 'uniquecrops',
			]
		],
		'untouched_nature': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'untouched_nature',
				'patchouli:book': 'untouched_nature:plants'
			]
		],
		'untouched_nature1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'untouched_nature',
				'patchouli:book': 'untouched_nature:lifestyle'
			]
		],
		'untouched_nature2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'untouched_nature',
				'patchouli:book': 'untouched_nature:supernatural'
			]
		],
		'untouched_nature3': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'untouched_nature',
				'patchouli:book': 'untouched_nature:tastes'
			]
		],
		'witchery': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:brews_and_infusions_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:circle_magic_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:collecting_fumes_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery3': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:conjuration_and_fetishes_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery4': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:distilling_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery5': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:herbology_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery6': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:symbology_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witchery7': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:witches_brew_book',
			'tag': [
				'akashictome:definedMod': 'witchery',
			]
		],
		'witcherycompanion': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'witcherycompanion',
				'patchouli:book': 'witcherycompanion:witches_companion'
			]
		],
		'wizardry': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'wizardry:book',
			'tag': [
				'akashictome:definedMod': 'wizardry'
			]
		],
		'woot': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:woot-guide',
			'tag': [
				'akashictome:definedMod': 'woot'
			]
		]
	]
])

player.addStartingItem(akashicTome)
player.addStartingItem(item('astralsorcery:itemjournal'))
player.addStartingItem(item('alquimia:lexicon'))
player.addStartingItem(item('botania:lexicon'))
player.addStartingItem(item('levelup2:skillbook'))

player.addStartingItem(item('antiqueatlas:empty_antique_atlas'))

player.addStartingItem(item('minecraft:leather_helmet'))
player.addStartingItem(item('minecraft:leather_chestplate'))
player.addStartingItem(item('minecraft:leather_leggings'))
player.addStartingItem(item('minecraft:leather_boots'))

crafting.addShapeless(akashicTome, [item('minecraft:book')])
