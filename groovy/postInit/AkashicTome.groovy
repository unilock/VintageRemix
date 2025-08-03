// AkashicTome

player.testingStartingItems = false // Enable this to have the items be given every time you join the world. Use in testing only.
player.replaceDefaultInventory = false // Enable this to replace any existing items with GroovyScript's starting inventory items.

def akashicTome = item('akashictome:tome').withNbt([
	'akashictome:data': [
		'academy': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'academy:tutorial',
			'tag': [
				'akashictome:definedMod': 'academy'
			]
		],
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
		'divinefavor': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'divinefavor',
				'patchouli:book': 'divinefavor:immaterial_guide'
			]
		],
		'ee': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'ee:end_info_book',
			'tag': [
				'akashictome:definedMod': 'ee'
			]
		],
		'elementaristics': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'elementaristics',
				'patchouli:book': 'elementaristics:liber_elementium'
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
		'exoticbirds': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'exoticbirds:bird_book',
			'tag': [
				'akashictome:definedMod': 'exoticbirds',
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
		'lordcraft': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'lordcraft:knowledge_book',
			'tag': [
				'akashictome:definedMod': 'lordcraft'
			]
		],
		'ltta': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'gbook:guidebook',
			'tag': [
				'akashictome:definedMod': 'ltta',
				'Book': 'ltta:xml/ltta.xml'
			]
		],
		'magicalsculpture': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'magicalsculpture:userguide',
			'tag': [
				'akashictome:definedMod': 'magicalsculpture'
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
		'opencomputers': [
			'Count': 1 as byte,
			'Damage': 4 as short,
			'id': 'opencomputers:tool',
			'tag': [
				'akashictome:definedMod': 'opencomputers'
			]
		],
		'patchoulibooks': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'patchoulibooks',
				'patchouli:book': 'patchoulibooks:gendustry'
			]
		],
		'patchoulibooks1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'patchouli:guide_book',
			'tag': [
				'akashictome:definedMod': 'patchoulibooks',
				'patchouli:book': 'patchoulibooks:patchoulibooks'
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
		'runesofwizardry': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'guideapi:runesofwizardry-guide_book',
			'tag': [
				'akashictome:definedMod': 'runesofwizardry'
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
			'id': 'uniquecrops:generic',
			'tag': [
				'akashictome:definedMod': 'uniquecrops'
			]
		],
		'uniquecrops1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'uniquecrops:bookmultiblock',
			'tag': [
				'akashictome:definedMod': 'uniquecrops'
			]
		],
		'witchery': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:brews_and_infusions_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery1': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:circle_magic_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery2': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:collecting_fumes_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery3': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:conjuration_and_fetishes_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery4': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:distilling_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery5': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:herbology_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
			]
		],
		'witchery6': [
			'Count': 1 as byte,
			'Damage': 0 as short,
			'id': 'witchery:symbology_book',
			'tag': [
				'akashictome:definedMod': 'witchery'
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

player.addStartingItem(akashicTome, 9)
player.addStartingItem(item('astralsorcery:itemjournal'), 10)
player.addStartingItem(item('alquimia:lexicon'), 11)
player.addStartingItem(item('botania:lexicon'), 12)

crafting.addShapeless(akashicTome, [item('minecraft:book')])
