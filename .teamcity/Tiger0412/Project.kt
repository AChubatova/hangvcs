package Tiger0412

import Tiger0412.buildTypes.*
import Tiger0412.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0412")
    name = "Tiger0412"

    vcsRoot(Tiger0412_cVCSroot)

    buildType(Tiger0412_Hi0)
    buildType(Tiger0412_Hi1)
    buildType(Tiger0412_Hi2)
    buildType(Tiger0412_Hi3)
})
