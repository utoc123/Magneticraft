package com.cout970.magneticraft.util.vector

import com.cout970.magneticraft.util.toRadians
import com.cout970.magneticraft.util.toRads
import net.minecraft.util.EnumFacing
import net.minecraft.util.EnumFacing.*
import net.minecraft.util.math.AxisAlignedBB
import net.minecraft.util.math.BlockPos
import net.minecraft.util.math.Vec3d

/**
 * Created by cout970 on 2017/02/20.
 */
fun EnumFacing.rotatePoint(origin: BlockPos, point: BlockPos): BlockPos {
    val rel = point - origin
    val rot = when (this) {
        DOWN -> return BlockPos(origin + BlockPos(Vec3d(rel).rotatePitch(-90.0f)))
        UP -> return BlockPos(origin + BlockPos(Vec3d(rel).rotatePitch(90.0f)))
        NORTH -> return point
        SOUTH -> 180.0f
        WEST -> 90.0f
        EAST -> 360f - 90.0f
    }
    val pos2 = Vec3d(rel).rotateYaw(rot.toRadians())
    val pos3 = pos2.transform { Math.round(it).toDouble() }
    return BlockPos(origin + BlockPos(pos3))
}
/**
 * The default value is associated to the NORTH direction
 */
fun EnumFacing.rotatePoint(origin: Vec3d,
                           point: Vec3d): Vec3d {
    val rel = point - origin
    val rot = when (this) {
        DOWN -> return origin + rel.rotatePitch(90.toRads().toFloat())
        UP -> return origin + rel.rotatePitch(-90.toRads().toFloat())
        NORTH -> return point
        SOUTH -> 180.0f
        WEST -> 90.0f
        EAST -> -90.0f
    }
    return origin + rel.rotateYaw(rot.toRadians())
}

fun EnumFacing.rotateBox(origin: Vec3d, box: AxisAlignedBB): AxisAlignedBB {
    val min = Vec3d(box.minX, box.minY, box.minZ)
    val max = Vec3d(box.maxX, box.maxY, box.maxZ)
    return rotatePoint(origin, min) toAABBWith rotatePoint(origin, max)
}

fun EnumFacing.isHorizontal() = this != UP && this != DOWN

fun EnumFacing.toBlockPos() = directionVec.toBlockPos()