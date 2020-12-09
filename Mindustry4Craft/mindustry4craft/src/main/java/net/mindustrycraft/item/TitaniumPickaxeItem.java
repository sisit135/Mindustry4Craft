
package net.mindustrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;

import net.mindustrycraft.itemgroup.Mindustry4CraftItemGroup;
import net.mindustrycraft.Mindustry4craftModElements;

import java.util.List;

@Mindustry4craftModElements.ModElement.Tag
public class TitaniumPickaxeItem extends Mindustry4craftModElements.ModElement {
	@ObjectHolder("mindustry4craft:titanium_pickaxe")
	public static final Item block = null;
	public TitaniumPickaxeItem(Mindustry4craftModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2048;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 20;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumItemItem.block, (int) (1)));
			}
		}, 1, -1.952f, new Item.Properties().group(Mindustry4CraftItemGroup.tab)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Can break almost every block."));
			}
		}.setRegistryName("titanium_pickaxe"));
	}
}
