package Tiger0314

import Tiger0314.buildTypes.*
import Tiger0314.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0314")
    name = "Tiger0314"

    vcsRoot(Tiger0314_cVCSroot)

    buildType(Tiger0314_Hi3)
    buildType(Tiger0314_Hi1)
    buildType(Tiger0314_Hi2)
    buildType(Tiger0314_Hi0)
})
