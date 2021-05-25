package Tiger0410

import Tiger0410.buildTypes.*
import Tiger0410.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0410")
    name = "Tiger0410"

    vcsRoot(Tiger0410_cVCSroot)

    buildType(Tiger0410_Hi2)
    buildType(Tiger0410_Hi3)
    buildType(Tiger0410_Hi0)
    buildType(Tiger0410_Hi1)
})
