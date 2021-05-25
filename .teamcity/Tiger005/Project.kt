package Tiger005

import Tiger005.buildTypes.*
import Tiger005.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger005")
    name = "Tiger005"

    vcsRoot(Tiger005_cVCSroot)

    buildType(Tiger005_Hi0)
    buildType(Tiger005_Hi1)
    buildType(Tiger005_Hi2)
    buildType(Tiger005_Hi3)
})
