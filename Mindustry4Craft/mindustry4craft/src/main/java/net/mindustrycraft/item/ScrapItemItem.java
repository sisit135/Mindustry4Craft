
package net.mindustrycraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mindustrycraft.itemgroup.Mindustry4CraftItemGroup;
import net.mindustrycraft.Mindustry4craftModElements;

@Mindustry4craftModElements.ModElement.Tag
public class ScrapItemItem extends Mindustry4craftModElements.ModElement {
	@ObjectHolder("mindustry4craft:scrap_item")
	public static final Item block = null;
	public ScrapItemItem(Mindustry4craftModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(Mindustry4CraftItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("scrap_item");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
